package resortedlistfilesjava;/*
  SortedList class is a doubly linked list that save elements in a sorted, increasing order. 
 */
import java.util.Iterator;

public class SortedList<T extends Comparable<T>> implements Iterable<T> {

	private Node<T> head;
	private Node<T> tail;
	private int count;

	public SortedList() {
		head = null;
		tail = null;
		this.count = 0;
	}
	
	/*
	 * Copy constructor:
	 * It gets a another sorted list, and copies it to this newly constructed 
	 * SortedList.
	 */
	public SortedList(SortedList<T> l) {
		// TODO
		Node<T> temp = l.head;

		while(temp != null){
			this.add(temp.getElem());
			temp = temp.getNext();
		}
		this.count = l.count;
	}

	/*
	 * Size of the Sorted List
	 */
	public int getCount(){
		return this.count;
	}


	/*
	 * Add element:
	 * It adds the passed in element to the list, such that the list remains sorted.
	 * 
	 * NOTE: if there is another element with the same value, insert the new 
	 * one just "before the next larger element". We will be writing element classes
	 * such that we can test if you inserted according to this spec.
	 * 
	 * EX: if the list has the following elements: 1->2->2->6->11
	 *     and you need to insert an element with value, it must be inserted 
	 *     between the second 2 and 6.
				*/
		public void add(T elem) {
			// TODO

			// New node to be added. It is initiated with .next and .prev set to null
			Node<T> node = new Node(elem);

			// If the new node is the first node of this sorted list
			if(this.head == null){
				this.head = node;
				this.tail = node;
				this.head.setPrev(null);
				this.count ++;
				return;
			}

			// If the new node's elem is less than first node's elem,
			// then insert new node before first node
			if(this.head.getElem().compareTo(elem) == 1 || this.head.getElem().compareTo(elem) == 0){
				this.head.setPrev(node);
				node.setNext(this.head);
				this.head = node;
				this.count ++;
				return;
			}

			// If the new node's elem is greater than last node's elem,
			// then insert new node after last node
			if(this.tail.getElem().compareTo(elem) == -1){
				node.setPrev(this.tail);
				this.tail.setNext(node);
				this.tail = node;
				this.count ++;
				return;
			}

			// At this point, the new node is to be inserted somewhere
			// in the the sorted list
			// We use current node to reach the point where the new node
			// is to be inserted
			Node<T> current = this.head.getNext();

			while (current.getElem().compareTo(elem) == -1) {
				current = current.getNext();
			}

			// Insert the new node before current node
			current.getPrev().setNext(node);
			node.setPrev(current.getPrev());
			current.setPrev(node);
			node.setNext(current);
			this.count ++;
		}
	
	/*
	 * Remove given element if exits:
	 * Look for the element, and if it exits, delete it.
	 *
	 *  
	 * NOTE: if more than one copy of the element exists, all need to be deleted.
	 * 
	 * Complexity: if there is more than one element equal to 
	 * the passed in element, you should not look up the next
	 * element starting from the head or tail. In other words, 
	 * if you have a list of n elements, and all the elements are equal, 
	 * the complexity of deleting all of them must be linear: O(n). 
	 * 
	 * EX: if the list has following elements: 1->2->2->6->11
	 *     and we would like to delete 2, the new list should
	 *     look like: 1->6->11
	 */
	public void remove(T elem) {
		// TODO
		Node<T> current = this.head;

		while(current.elem != elem){
			current = current.getNext();
			if(current == null){
				break;
			}
		}
		remove(current);
	}

	/*
	 * Remove the passed in node:
	 * In this method, you do not search for the element to be deleted,
	 * rather, you are given a reference to a node that need to be deleted.
	 * 
	 * NOTE: if the reference is "null", just return.
	 */
	public void remove(Node<T> n) {
		// TODO
		if(n == null){
			return;
		}
		else{
			if(n.getPrev() != null && n.getNext() != null){
				n.getPrev().setNext(n.getNext());
				n.getNext().setPrev(n.getPrev());
				this.count --;
			}
			else if(n.getPrev() == null && n.getNext() !=null){
				n.getNext().setPrev(null);
				this.head = n.getNext();
				this.count --;
			}
			else if(n.getPrev()!=null && n.getNext() == null){
				n.getPrev().setNext(null);
				this.tail = n.getPrev();
				this.count --;
			}
		}
	}
	
	/*
	 * Test whether the list is empty or not
	 */
	public boolean isEmpty() {
		//TODO
		return this.head == null;
	}
	
	/*
	 * Search for the passed in element:
	 * If the given element is found, return a reference to the first 
	 * occurrence of the element in the list.
	 * 
	 */
	public Node<T> search(T elem) {

		// TODO
		Node<T> temp = this.head;
		while(temp.getElem() != elem){
			temp = temp.getNext();
			if(temp == null){
				break;
			}
		}
		return temp;
	}

	/* Return the index of the given element if found.
	 * return -1 if it does not exist
	 */
	public int indexOf(T elem) {
		// TODO
		int counter = 0;
		Node<T> temp = this.head;

		while(temp.getElem() != elem){
			temp = temp.getNext();
			if(temp == null){
				counter = -1;
				break;
			}
			counter++;
		}
		return counter;
	}

	/*
	 * Return a list iterator.
	 */
	@Override
	public Iterator<T> iterator() {

		/*Might need to change this. We provided Default constructor 
		 * to get rid of compiler errors
		 * */
		// TODO
		return new SortedListIterator<>(this, this.head);
	}

	/*
	 * Checks if the passed in list is equal to this list.
	 * 
	 * NOTE: we are checking if the whole list matches the 
	 * passed in list.
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO
		if(this == obj) return true;
		if(obj == null) return false;
		if(this.getClass() != obj.getClass()) return false;

		SortedList<T> that = (SortedList<T>) obj;

		if(this.getCount() != that.getCount()) return false;
//		if(this.tail != that.tail) return false;

		return true;
	}

	public void printList() {
		if (this.head == null)
			return;
		Node<T> temp = this.head;
		while (temp != null) {
			System.out.println(temp.elem.toString());
			temp = temp.next;
		}
	}

}
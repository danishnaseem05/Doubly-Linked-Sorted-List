package resortedlistfilesjava;

import java.util.*;

public class SortedListIterator<T extends Comparable<T>> implements Iterator<T> {

	/*
	 *Constructor is missing: You need to provide it.
	 *
	 *You might need to add attributes and methods to get the desired functionality.
	 */
	private Node<T> current;

	public SortedListIterator(SortedList<T> l, Node<T> head){
		this.current = head;
	}
	
	/*
	 * hasNext: return true if there is at least one more element to be visited,
	 * and it returns false otherwise.
	 */
	@Override
	public boolean hasNext() {
		return current != null;
	}

	/*
	 * next: return the next unvisited element. There should be a pointer pointing 
	 * to the element that is not visited yet. The pointer is advanced every time 
	 * you visit an element. If there is no element to be visited, return null.
	 */
	@Override
	public T next() {
		T elem = current.getElem();
		current = current.getNext();
		return elem;
	}

}

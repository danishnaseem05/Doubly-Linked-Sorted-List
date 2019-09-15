package resortedlistfilesjava;

public class Node<T extends Comparable<T>> {
	public T elem;
	public Node<T> next;
	public Node<T> prev;

	public Node(T elem, Node<T> next, Node<T> prev) {
		this.elem = elem;
		this.next = next;
		this.prev = prev;
	}

	public Node(T elem) {
		this.elem = elem;
		this.next = null;
		this.prev = null;
	}
	///// DO NOT EDIT THE ABOVE.
	
	//You are free to add more methods below.....

	// Setters and Getters for next, prev, and elem respectively.

	public void setNext(Node<T> next){
		this.next = next;
	}
	public Node<T> getNext(){
		return this.next;
	}

	public void setPrev(Node<T> prev){
		this.prev = prev;
	}
	public Node<T> getPrev(){
		return this.prev;
	}

	public void setElem(T elem){
		this.elem = elem;
	}
	public T getElem(){
		return this.elem;
	}
}
package main;

public class Node<T> {

	private T element;
	private Node<T> prev, next;
	
	public Node () {
		
	}
	
	public Node (T element, Node<T> next, Node<T> prev) {
		this.element = element;
		this.next = next;
		this.prev = prev;
	}

	public T getElement() {
		return element;
	}

	
	public void setElement(T element) {
		this.element = element;
	}

	public Node<T> getPrev() {
		return prev;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
	
	
	
}

package main;
import main.Node;

public class List<T> {
	
	private Node<T> first, last;
	private int size;
	
	public List () {
		
	}
	
	public void isEmpty () {
		
	}
	
	public void addElement (Node<T> newNode, Node<T> nextNode) {
		Node<T> Node = new Node<T> ();
		Node.setNext(nextNode);
		Node.setPrev(nextNode.getPrev());
		nextNode.setPrev(Node);
		
	}
	
	public void removeElement (Node<T> nodeToBeRemoved) {
		
		
	}
	
	

}

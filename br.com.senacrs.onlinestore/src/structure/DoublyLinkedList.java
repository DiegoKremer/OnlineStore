package structure;

public class DoublyLinkedList<T> {

	
	// Class to create the Node object. 
	public static class Node<T> {

		private T data;
		private Node next;
		private Node previous;

		public Node (T data) {
			
			this.data = data;

		}
	
	}
	
	
	// Create first and last Nodes with null values. 
	
	public Node first = null;
	public Node last = null;
	
	
	// Check if the list is empty. 
	
	public boolean isEmpty () 
	{
		return first == null;
	}
	
	
	// Insert the data in the first Node of the list.
	
	public void addFirst (T data) 
	{
		Node newNode = new Node (data);
		 
		/* If the list is empty will leave the Node with no links 
		 * and set the first and last values to it. */
		
		if (isEmpty()) 
		{
			newNode.next = null;
			newNode.previous = null;
			first = newNode;
			last = newNode;
		}
		
		/* 
		 * If the list is not empty will then link the new Node and 
		 * set it as the previous Node of the current first, 
		 * set the new Node Next link to the current first, 
		 * leave it with no previous link and set it as the new first.
		 */
		else 
		{
			first.previous = newNode;
			newNode.next = first;
			newNode.previous = null;
			first = newNode;
		}
	}

}

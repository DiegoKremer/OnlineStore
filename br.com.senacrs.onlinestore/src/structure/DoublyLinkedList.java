package structure;

public class DoublyLinkedList<T> {


	// Class to create the Node object. 
	private static class Node<T> {

		/*
		 * The Node has three variables, which will be one to store wanted the data, 
		 * one to be the link to its next Node and another to be link to the 
		 * previous Node to which it might be connected.
		 */
		private T data;
		private Node next;
		private Node previous;

		public Node (T data) {

			this.data = data;

		}

	}


	// Create first and last Nodes with null values. 

	private Node<T> first = null;
	private Node<T> last = null;


	// See if the list is empty by checking if the first position is null.  

	public boolean isEmpty () 
	{
		return first == null;
	}


	// Add a new Node to the first position of the list.

	public void addFirst (T data) 
	{
		Node newNode = new Node (data);

		/* 
		 * If the list is empty will leave the Node with no links 
		 * and set it at the first and last position. 
		 */

		if (isEmpty()) 
		{
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
			first = newNode;
		}
	}


	// Remove first Node of the list.

	public void removeFirst () 
	{
		/* 
		 * If list is not empty then creates a temporary Node to receive the Node  
		 * at the first position.
		 */
		if (!isEmpty()) 
		{
			Node temporary = first;

			/* 
			 * If the first Node don't have a next Node linked to it 
			 * then set the Node position first and last to null. 
			 */
			if (first.next == null) 
			{
				first = null;
				last = null;
			}
			/* 
			 * If the first Node has a next Node linked to it then
			 * set the new first as the next Node and remove the
			 * link with the previous Node as it is now the new first.
			 */
			else 
			{
				first = first.next;
				first.previous = null;
			}
		}
	}


	
	// Remove last Node of the list.

	public void removeLast () 
	{
		/* 
		 * Creates a temporary Node to receive the value of the Node at
		 * the last position of the list.
		 */
		Node temporary = last;

		if (!isEmpty()) 
		{	

			/* 
			 * If the first Node don't have a next Node linked to it 
			 * then set the Node position first and last to null. 
			 */
			if (first.next == null) 
			{
				first = null;
				last = null;
			}
			/* 
			 * If the first Node has a Node on its next link, it will
			 * set the last position with the previous Node and set this
			 * Node next link to null as it is now the new last. 
			 */
			else 
			{
				last = last.previous;
				last.next = null;
			}
		}

	}

}

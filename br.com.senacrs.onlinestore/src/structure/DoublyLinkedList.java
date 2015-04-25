package structure;

public class DoublyLinkedList<T> {


	// Class to create the Node object. 
	public static class Node<T> {

		private T data;
		private Node next;
		private Node previous;

		public Node (T data) {

			this.data = data;
			this.next = null;
			this.previous = null;

		}

	}


	// Create first and last Nodes with null values. 

	public Node<T> first = null;
	public Node<T> last = null;


	// See if the list is empty by checking if the first position is null.  

	public boolean isEmpty () 
	{
		return first == null;
	}


	// Add a new Node to the first position of the list.

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


	// Remove first Node of the list.

	public void removeFirst () 
	{
		/* 
		 * If list is not empty then creates a temporary Node and add 
		 * it at the first position of the list.
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

}

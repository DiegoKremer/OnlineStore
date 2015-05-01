package structure;
import model.Item;


public class DoublyLinkedList {


	// Class to create the Node object. 
	private static class Node {

		/*
		 * The Node has three variables, which will be one to store wanted the data, 
		 * one to be the link to its next Node and another to be link to the 
		 * previous Node to which it might be connected.
		 */
		private Item data;
		private Node next;
		private Node previous;

		public Node (Item data) {

			this.data = data;

		}

		@Override
		public String toString() {
			return data.toString();
		}

	}


	// Create first and last Nodes with null values. 

	private Node first = null;
	private Node last = null;


	// See if the list is empty by checking if the first position is null.  

	public boolean isEmpty () 
	{
		return first == null;
	}


	// Add a new Node to the first position of the list.

	public void addFirst (Item data) 
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

	/* 
	 * Rewrites toString method to display the whole content of the list using its
	 * string representation.
	 */
	@Override
	public String toString () 
	{
		StringBuilder s = new StringBuilder ();
		Node current = first;

		/* Loop through the list appending the content while current position is not empty. */

		while (current != null) {
			s.append(current.toString()+"\n");
			current = current.next;
		}   	

		/* Return the content of all list positions converted to String type */

		return s.toString();

	}


	/*
	 * Count and return the current size of the list.
	 */

	public int listSize () {
		int size = 0;
		Node current = first;

		/*
		 * Loop while counting the number of positions of the list
		 * and increments to a size variable.
		 */
		while (current!=null) 
		{
			current = current.next;
			size++;
		}
		/* Returns the size of the list. */
		return size;
	}


	/* Sort the list content by description words in alphabetical order. */

	public void sort () 
	{	
		
		/* Iterate through the list starting at first position until it is null. */
		for (Node index = first; index!=null; index = index.next) 
		{
			/* Create Node to store the minimum value and to start set it with the
			 * value from the first Node. */
			Node min = index;

			/* Iterate through the list starting at the previous index point. */
			for (Node following = index; following!=null; following = following.next) 
			{
				/* Compare the chars at the words of description attribute between the Node of current 
				 * minimum value with the value of current Node and if minimum value is 
				 * greater than current value it will swap the minimum value. */
				if (min.data.getDescription().charAt(0) > following.data.getDescription().charAt(0)) 
				{
					min = following;
				}

			}
			/* Copy the content of the index Node to a temporary Node. */
			Node temp = new Node(index.data);

			/* Copy the content of the Node with the minimum value to the Node at Index. */
			index.data = min.data;

			/* Copy the content of the temporary Node to the minimum Node. */
			min.data = temp.data;
		}
	}



	/* Searches the list by description attribute using a string parameter */

	public void searchDescription (String value) 
	{
		/* Checks first if the list is empty, if positive will inform. */
		if (isEmpty()) 
		{
			System.out.println("The list is empty.");
		} 
		else 
		{
			/* Iterate through the list starting at first position until it is null. */
			for (Node index = first; index!=null; index = index.next) 
			{
				/* Test if the description of the current Item contains the String 
				 * value received from method parameter. */
				if (index.data.getDescription().contains(value)) 
				{
					/* If the Item description contains the string value informed then
					 * it will print on the console the Item information. */
					System.out.println(index.toString());
				}

			}
		}

	}
	
	/* Searches the list using an Item as parameter */
	
	public boolean searchItem (Item item) 
	{
		{
			/* Checks first if the list is empty, if positive will inform. */
			if (isEmpty()) 
			{
				System.out.println("The list is empty.");
			} 
			else 
			{
				/* Iterate through the list starting at first position until it is null. */
				for (Node index = first; index!=null; index = index.next) 
				{
					/* Test if the informed item is the same as the item stored on the Node */
					if (index.data.equals(item)) 
					{
						/* If the Item informed matches the Item from a Node on the list it
						 * returns true. */
						
					return true;
						
					}

				}
			}

		}
		
		/* If the Item is not found, then it will return false. */
		
		return false;
	}

}

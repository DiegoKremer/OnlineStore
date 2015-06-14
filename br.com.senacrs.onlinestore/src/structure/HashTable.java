package structure;

import model.Book;

public class HashTable {

	/* Creates a cell that will store the key and value */

	public class HashCell {

		private int key;
		private Book value;

		public HashCell(int key, Book value) {
			this.key = key;
			this.value = value;
		}

		public int getKey() {
			return key;
		}

		public Book getValue() {
			return value;
		}

		public String toString() {

			return value.toString();

		}

	}

	private int capacity;
	private int usedCapacity;
	private HashCell[] table;

	/* Main constructor for the Hash Table */

	public HashTable(int initialCapacity) {
		this.capacity = initialCapacity;
		table = new HashCell[initialCapacity];
		capacity = initialCapacity;
	}


	/* Insertion method using Cuckoo collision handling */

	public void insert (Book value) {
		
		/* Run the first and second functions on the ISBN code
		 * from the book parameter and store on their respective
		 * variables */
		
		int firstHash = hashFunctionOne(value.getISBN());
		int secondHash = hashFunctionTwo(value.getISBN());
		
		Book tempOldValue;
		
		/* If position generated by first function is null will then add to it. */
		
		if (table[firstHash] == null) {
			table[firstHash] = new HashCell(value.getISBN(), value);
			usedCapacity++;
			checkLoadFactor();
			
		/* If position not null will try the second function. */
		} else if (table[secondHash] == null) {
			table[secondHash] = new HashCell(value.getISBN(), value);
			usedCapacity++;
			checkLoadFactor();
			
		/* If position from second function also not null will move the element from
		 * the position and arrange a new position for the old one. */
		} else {
			tempOldValue = table[secondHash].getValue();
			table[secondHash] = new HashCell(value.getISBN(), value);
			insert(tempOldValue);
			usedCapacity++;
			checkLoadFactor();
		}

	}
	
	/* Get the Book based on the provided key */
	
	public Book get (int key) {
		
		/* Run the first and second functions on the key 
		 * received as parameter and store in their respective
		 * variables */
		
		int firstHash = hashFunctionOne(key);
		int secondHash = hashFunctionTwo(key);
		
		/* Check if the table position of the result of the first function is 
		 * not null and the key equals to the one from the slot and return the 
		 * value stored there. */
		
		if (table[firstHash] != null && table[firstHash].getKey() == key) {
			return table[firstHash].getValue();
			
		/* If not the same key then it will jump to the position of the second
		 * function and return its value. */
			
		} else {
			return table[secondHash].getValue();
		}
	}
	
	/* Returns the result of the first function to be used on the Hash Table */

	public int hashFunctionOne(int value) {
		int hash = 0;
		hash = value % capacity;
		return hash;
	}
	
	
	/* Returns the result of the second function to be used on the Hash Table */

	public int hashFunctionTwo(int value) {
		int hash = 0;
		hash = value % (capacity / 2);
		return hash;
	}

	
	/* Method will check current usage percentage of the Hash Table and if 
	 * it exceeds 80% will then double its size */
	
	public void checkLoadFactor () {
		int usage = (usedCapacity / capacity) * 100;
		if (usage > 80) {
			capacity = capacity * 2;
		}
	}

	public String toString() {

		/*
		 * Loop through the list appending the content while current position is
		 * not empty.
		 */

		StringBuilder s = new StringBuilder();

		for (int i = 0; table.length > i;) {
			if (table[i] != null)
				s.append(table[i].toString());
			else
				i++;
		}

		return s.toString();

		/* Return the content of all list positions converted to String type */

	}

}

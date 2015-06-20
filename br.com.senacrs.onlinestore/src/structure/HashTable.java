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

	private int usedCapacity;
	private HashCell[] table;
	private int cycleControl = 0;

	/* Main constructor for the Hash Table */

	public HashTable(int initialCapacity) {
		table = new HashCell[initialCapacity];

	}

	/* Insertion method using Cuckoo collision handling */

	public void insert(Book value) {

		/*
		 * Run the first, second and third functions on the ISBN code from 
		 * the book parameter and store on their respective variables
		 */

		int firstHash = hashFunctionOne(value.getISBN());
		System.out.println("first hash: "+firstHash);
		int secondHash = hashFunctionTwo(value.getISBN());
		System.out.println("second hash: "+secondHash);
		

		/* If position generated by first function is null will then add to it. */

		if (table[firstHash] == null) {
			table[firstHash] = new HashCell(firstHash, value);
			
			cycleControl = 0;

			/* If position not null will try the second function. */
		} else if (table[secondHash] == null) {
			table[secondHash] = new HashCell(secondHash, value);
			
			cycleControl = 0;
			/*
			 * If position from second function also not null will move the
			 * element from the position and arrange a new position for the old
			 * one.
			 */
		

		} else {

			Book tempOldValue;
			tempOldValue = table[secondHash].getValue();
			table[secondHash] = new HashCell(secondHash, value);
			cycleControl++;
			if (cycleControl < 5) {
				checkLoadFactor();
			}
			insert(tempOldValue);
			}
		

	}

	/* Get the Book based on the provided key */

	public Book get(String isbn) {

		/*
		 * Run the first and second functions on the key received as parameter
		 * and store in their respective variables
		 */

		int firstHash = hashFunctionOne(isbn);
		int secondHash = hashFunctionTwo(isbn);

		/*
		 * Check if the table position of the result of the first function is
		 * not null and the key equals to the one from the slot and return the
		 * value stored there.
		 */

		if (table[firstHash] != null && table[firstHash].getKey() == firstHash) {
			return table[firstHash].getValue();

			/*
			 * If not the same key then it will jump to the position of the
			 * second function and return its value.
			 */

		} else {
			return table[secondHash].getValue();
		}
	}

	/* Returns the current Hash Table number of buckets */

	private int capacity() {
		return table.length;
	}

	/* Returns the result of the first function to be used on the Hash Table */

	private int hashFunctionOne(String isbn) {
		char ch[];
		ch = isbn.toCharArray();
		int i, sum;
		for (sum = 0, i = 0; i < isbn.length(); i++) {
			sum += ch[i];
		}
		return sum % capacity();
	}

	/* Returns the result of the second function to be used on the Hash Table */

	private int hashFunctionTwo(String isbn) {
		int intLength = isbn.length() / 4;
	     int sum = 0;
	     for (int j = 0; j < intLength; j++) {
	       char c[] = isbn.substring(j * 4, (j * 4) + 4).toCharArray();
	       int mult = 1;
	       for (int k = 0; k < c.length; k++) {
		 sum += c[k] * mult;
		 mult *= 256;
	       }
	     }

	     char c[] = isbn.substring(intLength * 4).toCharArray();
	     int mult = 1;
	     for (int k = 0; k < c.length; k++) {
	       sum += c[k] * mult;
	       mult *= 256;
	     }

	     return(Math.abs(sum) % capacity());
	}



	/*
	 * Method will check current usage percentage of the Hash Table and if it
	 * exceeds 85% will then double its size
	 */

	private void checkLoadFactor() {
		int usage = (getUsedCapacity() / capacity()) * 100;
		if (usage > 60) {
			doubleCapacity(table);
		}
	}

	/*
	 * Increase the size of the hash table when it reaches its stipulated
	 * threshold
	 */

	private HashCell[] doubleCapacity(HashCell[] tableParam) {
		HashCell[] oldTable = new HashCell[capacity()];
		HashCell[] newTable = new HashCell[capacity() * 2];

		System.arraycopy(tableParam, 0, oldTable, 0, capacity());

		setTable(newTable);
		for (int i = 0; oldTable.length > i; i++) {
			if (oldTable[i] != null) {
				insert(oldTable[i].getValue());
			}
		}

		return table;
	}
	
	
	/* Returns the total used capacity of the Hash Table */
	
	public int getUsedCapacity () {
		int used = 0;
		for (int i = 0; i < table.length; i++) {
			if (table[i] != null)
			used++;
		}
		return used;
	}
	
	/* Returns the total capacity of the Hash Table */
	public int getCurrentCapacity () {
		return table.length;
	}
	

	/* Sets a new table as the default Hash Table */

	private void setTable(HashCell[] table) {
		this.table = table;
	}

	public String toString() {

		/*
		 * Loop through the list appending the content while current position is
		 * not empty.
		 */

		String s = "Table Content: \n";

		for (int i = 0; i < table.length; i++) {
			if (table[i] == null) {
				s = s + "" + "\n";
			} else
				s = s + table[i].getValue().toString() + "\n";
		}

		return s;

		/* Return the content of all list positions converted to String type */

	}

}

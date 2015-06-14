package structure;

import model.Book;

public class HashTable {

	/* Creates a cell that will store the key and value */

	public class HashCell {

		private long key;
		private Book value;

		public HashCell(long key, Book value) {
			this.key = key;
			this.value = value;
		}

		public long getKey() {
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

	/* Main constructor for the Hash Table */

	public HashTable(int initialCapacity) {
		table = new HashCell[initialCapacity];

	}

	/* Insertion method using Cuckoo collision handling */

	public void insert(Book value) {

		/*
		 * Run the first and second functions on the ISBN code from the book
		 * parameter and store on their respective variables
		 */

		int firstHash = hashFunctionOne(value.getISBN());
		int secondHash = hashFunctionTwo(value.getISBN());
		int thirdHash = hashFunctionThree(value.getISBN());

		/* If position generated by first function is null will then add to it. */

		if (table[firstHash] == null || table[firstHash].getValue() != value) {
			table[firstHash] = new HashCell(value.getISBN(), value);
			usedCapacity++;

			/* If position not null will try the second function. */
		} else if (table[secondHash] == null
				|| table[secondHash].getValue() != value) {
			table[secondHash] = new HashCell(value.getISBN(), value);
			usedCapacity++;

			/*
			 * If position from second function also not null will move the
			 * element from the position and arrange a new position for the old
			 * one.
			 */
		} else if (table[thirdHash] == null
				|| table[thirdHash].getValue() != value) {
			table[thirdHash] = new HashCell(value.getISBN(), value);

		} else {
			Book tempOldValue;
			tempOldValue = table[thirdHash].getValue();
			table[thirdHash] = new HashCell(value.getISBN(), value);
			insert(tempOldValue);
			usedCapacity++;
			checkLoadFactor();

		}

	}

	/* Get the Book based on the provided key */

	public Book get(long key) {

		/*
		 * Run the first and second functions on the key received as parameter
		 * and store in their respective variables
		 */

		int firstHash = hashFunctionOne(key);
		int secondHash = hashFunctionTwo(key);

		/*
		 * Check if the table position of the result of the first function is
		 * not null and the key equals to the one from the slot and return the
		 * value stored there.
		 */

		if (table[firstHash] != null && table[firstHash].getKey() == key) {
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

	private int hashFunctionOne(long value) {
		int hash;
		int integerValue = 0;
		if (value > Integer.MAX_VALUE) {
			integerValue = convertValueToInt(value);
		}
		hash = integerValue % capacity();
		return hash;
	}

	/* Returns the result of the second function to be used on the Hash Table */

	private int hashFunctionTwo(long value) {
		int hash;
		int integerValue = 0;
		if (value > Integer.MAX_VALUE) {
			integerValue = convertValueToInt(value);
		}
		hash = integerValue % (capacity() / 2);
		return hash;
	}

	/* Returns the result of the third function to be used on the Hash Table */

	private int hashFunctionThree(long value) {
		int hash;
		int integerValue = 0;
		if (value > Integer.MAX_VALUE) {
			integerValue = convertValueToInt(value);
		}
		hash = integerValue % (capacity() / 5);
		return hash;
	}

	/*
	 * Converts the long value received from ISBN field to an Integer by
	 * removing the first 4 digits of the code, which has a high repeat rate
	 */

	private int convertValueToInt(long value) {
		String longNumberString = Long.toString(value);
		long newValue = Long.parseLong(longNumberString.substring(5, 12));
		return (int) newValue;
	}

	/*
	 * Method will check current usage percentage of the Hash Table and if it
	 * exceeds 85% will then double its size
	 */

	private void checkLoadFactor() {
		int usage = (usedCapacity / capacity()) * 100;
		if (usage > 85) {
			doubleCapacity(table);
		}
	}

	/*
	 * Increase the size of the hash table when it reaches its stipulated
	 * threshold
	 */

	private HashCell[] doubleCapacity(HashCell[] table) {
		HashCell[] oldTable = new HashCell[capacity()];
		HashCell[] newTable = new HashCell[capacity()];

		System.arraycopy(table, 0, oldTable, 0, capacity());

		setTable(newTable);
		for (int i = 0; table.length > i; i++) {
			if (oldTable[i] != null) {
				insert(table[i].getValue());
			}
		}

		return table;
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

		for (int i = 3; i < table.length; i++) {
			if (table[i] == null) {
				s = s + "Empty Slot" + "\n";
			} else
				s = s + table[i].getValue().toString() + "\n";
		}

		return s;

		/* Return the content of all list positions converted to String type */

	}

}

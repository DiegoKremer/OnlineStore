package structure;

import model.Book;



public class HashTable {
	
	/* Creates a cell that will store the key and value */
	
	public class HashCell {
		
		private int key;
		private Book value;
		
		public HashCell (int key, Book value) {
			this.key = key;
			this.value = value;
		}
		
		public int getKey () {
			return key;
		}
		
		public Book getValue () {
			return value;
		}
		
	}
	
	private int initialCapacity;
	private int currentCapacity;
	private HashCell[]  table;
	
	
	/* Main constructor for the Hash Table */
	
	public HashTable (int initialCapacity) {
		this.initialCapacity = initialCapacity;
		table = new HashCell[initialCapacity];
		currentCapacity = initialCapacity;
	}
	
	/* Insert method. Receives a Book as parameter. */
	
	public void insert (Book value) {
		/* Calculates the hash function of the received parameter */
		int hash = hashFunction(value);
		
		/* Check if table index is not null or is already occupied with a different key. 
		 * If it is, then it will increment 1 to hash function result as a way to prevent
		 * collision by linear probing */
		while (table[hash] != null && table[hash].getKey() != value.getiISBN()) {
			hash = (hashFunction(value) + 1) % currentCapacity;
		}
		
		/* Insert the cell with key and value into current index of the table */
		table[hash] = new HashCell (value.getiISBN(), value);
	}
	
	public Book get (int key) {
		int hash = (key % currentCapacity);
		while (table[hash] == null && table[hash].getKey() != key) {
			 hash = (hash + 1) % currentCapacity;
		}
		return table[hash].getValue();
		}
		
	
	public int hashFunction (Book value) {
		int hash = 0;
			hash = value.getiISBN() % currentCapacity;
		return hash;
	}
	
	public void size () {
		
	}
	
	public void isEmpty() {
		
	}

}

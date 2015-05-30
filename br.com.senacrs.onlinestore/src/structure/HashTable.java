package structure;

import model.Book;



public class HashTable {
	
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
	
	public HashTable (int initialCapacity) {
		this.initialCapacity = initialCapacity;
		table = new HashCell[initialCapacity];
		currentCapacity = initialCapacity;
	}
	
	public void insert (Book value) {
		int hash = hashFunction(value);
		while (table[hash] != null && table[hash].getKey() != value.getiISBN()) {
			hash = (hashFunction(value) + 1) % currentCapacity;
		}
		table[hash] = new HashCell (value.getiISBN(), value);
	}
	
	public Book get (int key) {
		int hash = (key % currentCapacity);
		while (table[hash] != null && table[hash].getKey() != key) {
			 hash = (hash + 1) % currentCapacity;
			/* if (table[hash] == null) {
                 return;
		} else { */
			 
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

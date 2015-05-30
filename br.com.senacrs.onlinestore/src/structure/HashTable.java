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
	
	public HashTable (int initialCapacity) {
		this.initialCapacity = initialCapacity;
		
	}
	
	public void insert () {
		
	}
	
	public int hashFunction (int k, Book value) {
		int hashValue = 0;
			hashValue = value.getiISBN() % 5000;
		return hashValue;
	}
	
	public void size () {
		
	}
	
	public void isEmpty() {
		
	}

}

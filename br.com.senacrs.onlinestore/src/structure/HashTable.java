package structure;

import model.Book;

public class HashTable {
	
	private int initialCapacity;
	private Book[] book;
	
	public HashTable (int initialCapacity) {
		this.initialCapacity = initialCapacity;
		book = new Book[initialCapacity];
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

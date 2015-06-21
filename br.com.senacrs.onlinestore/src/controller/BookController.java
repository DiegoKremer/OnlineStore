package controller;

import java.io.FileNotFoundException;

import structure.FileReader;
import structure.HashTable;

public class BookController {
	
	private HashTable bookStock = new HashTable ();
	
	
	public void loadBooks () {
		FileReader reader = new FileReader ();
		try {
			reader.readCSV(bookStock);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void listBooks () {
		
		System.out.println(bookStock);
	}
	
}

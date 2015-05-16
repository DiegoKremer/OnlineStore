package controller;

import java.io.FileNotFoundException;

import view.View;
import structure.DoublyLinkedList;
import structure.FileReader;

public class Controller {
	
	private View view = new View ();
	private DoublyLinkedList itemStock = new DoublyLinkedList ();
	
	public Controller () {
		
	}
	
	
	/* Load items from an external file into the application list
	 * and catch if source file is not found. */
	
	public void loadItems () {
		FileReader reader = new FileReader ();
		try {
			reader.readCSV(itemStock);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/* Search Items from the list by their name. */
	
	public void searchItems (String value) {
		
		itemStock.searchItemName(view.searchView());
		
		
	}
	
	public void listItems () {
		
		System.out.println(itemStock);
		
	}
	
	
	
	
	
	
	
	
	
}

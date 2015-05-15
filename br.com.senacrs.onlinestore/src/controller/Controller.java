package controller;

import java.io.FileNotFoundException;

import view.View;
import structure.DoublyLinkedList;
import structure.FileReader;

public class Controller {
	
	private View appView = new View ();
	private DoublyLinkedList itemStock = new DoublyLinkedList ();
	
	public Controller () {
		
	}
	
	
	/* Load items from an external file into the application list. */
	
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
	
	public void searchItems () {
		
		itemStock.searchItemName(appView.searchView());
		
	}
	
	
	
}

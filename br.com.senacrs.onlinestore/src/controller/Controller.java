package controller;

import java.io.FileNotFoundException;


import structure.DoublyLinkedList;
import structure.FileReader;
import structure.HashTable;
import view.View;

public class Controller {

	private HashTable bookStock = new HashTable ();
	private DoublyLinkedList itemStock = new DoublyLinkedList ();
	private View view = new View ();
	

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
		itemStock.searchItemName(value);
	}
	

	public void listItems () {
		System.out.println(itemStock);
	}


	public void menuSelection () {
		switch (view.readInput()) {
		case "1" : 
			searchItems(view.searchView());
			returnSearchSelection(view.returnSearchView());
		case "2" :
			view.showCart();
		case "3":
			view.showPurchase();
		case "4":
			System.exit(0);
		}
	}
	
	
	public void returnSearchSelection (String value) {
		if (value.equals("1")) {
			searchItems(view.searchView());
			view.returnSearchView();
		} else if (value.equals("2")) {
			view.showMainMenu();
			menuSelection();
		} else {
			view.invalidInput();
			returnSearchSelection(view.returnSearchView());
		}
	}
	
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
		
		//System.out.println(bookStock);
		System.out.println("Used Capacity: " + bookStock.getUsedCapacity());
		System.out.println("Current Capacity: " + bookStock.getCurrentCapacity());
	}
	
	public String retrieveBook (String isbn) {
		return bookStock.get(isbn).toString() + " retrieved with success.";
	}
	
	




}

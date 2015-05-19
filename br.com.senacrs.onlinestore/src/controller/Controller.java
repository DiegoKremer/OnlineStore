package controller;

import java.io.FileNotFoundException;

import structure.DoublyLinkedList;
import structure.FileReader;
import view.View;

public class Controller {

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
		case "2" :
			view.showCart();
		case "3":
			view.showPurchase();
		case "4":
		}
	}








}

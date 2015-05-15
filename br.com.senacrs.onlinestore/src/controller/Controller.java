package controller;

import view.View;
import structure.DoublyLinkedList;

public class Controller {
	
	private View appView = new View ();
	private DoublyLinkedList itemStock = new DoublyLinkedList ();
	
	public Controller () {
		
	}
	
	
	/* Search Items from the list by their name. */
	
	public void searchItems () {
		
		itemStock.searchItemName(appView.searchView());
		
	}
	
	
	
}

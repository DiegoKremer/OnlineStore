package view;

import java.util.Scanner;

public class View {
	
	private Scanner keyboard = new Scanner (System.in);
	
	/* Class constructor */
	
	public View () {
		
	}
	
	/* The first menu to appears as the program is executed. 
	 * Shows the main options of the store. */
	
	public void showMainMenu () {
		System.out.println("WELCOME TO THE ONLINE STORE\n");
		System.out.println("What do you want to do? \n\n "
				+ "1 - Search Items\n"
				+ "2 - Show Cart\n "
				+ "3 - Purchase\n"
				+ "4 - Exit");
		
		switch (readInput()) {
		case "1" : 
			searchView();
		case "2" :
			showCart();
		case "3":
			showPurchase();
		case "4":
		}
	}
	
	private void showPurchase() {
		// TODO Auto-generated method stub
		
	}

	private void showCart() {
		// TODO Auto-generated method stub
		
	}
	

	/* View that will show the user a message requesting to
	 * insert a String type to search.  */
	
	public String searchView () {
		
		System.out.println("Please enter the Item you wish to search: ");
		return readInput();
		
	}
	
	
	/* Returns a basic String input from the scanner. */
	
	public String readInput () {
		return keyboard.next();
	}
	
	

}

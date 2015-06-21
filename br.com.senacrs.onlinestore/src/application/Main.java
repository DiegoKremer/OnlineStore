package application;

import java.io.FileNotFoundException;


import controller.Controller;

public class Main {
	
	public static void main(String [] args) throws FileNotFoundException {
		

		/* Creation of the objects needed for testing */
		
		
		Controller controller = new Controller ();
		
		
		
		/* Software execution stream */
		
		controller.loadBooks();
		controller.listBooks();
		System.out.println(controller.retrieveBook("9781101910481"));
	
		/* 
		controller.loadItems();
		appView.showMainMenu();
		controller.menuSelection();
		*/
			
		
		
	}

}

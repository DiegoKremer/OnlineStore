package application;

import java.io.FileNotFoundException;

import controller.Controller;
import structure.HashTable;
import view.View;

public class Main {
	
	public static void main(String [] args) throws FileNotFoundException {
		

		/* Creation of the objects needed for testing */
		
		View appView = new View ();
		Controller controller = new Controller ();
		
		
		/* Software execution stream */
		
		controller.loadItems();
		appView.showMainMenu();
		controller.menuSelection();
		
			
		HashTable hash = new HashTable (6000);
		
		
	}

}

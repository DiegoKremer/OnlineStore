package application;

import java.io.FileNotFoundException;

import controller.Controller;
import structure.DoublyLinkedList;
import structure.FileReader;
import model.*;
import view.View;

public class Main {
	
	public static void main(String [] args) throws FileNotFoundException {
		

		/* Creation of the objects needed for testing */
		
		View appView = new View ();
		Controller controller = new Controller ();
		
		
		controller.loadItems();
		appView.showMainMenu();
		
		
	}

}

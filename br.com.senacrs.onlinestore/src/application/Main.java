package application;

import structure.DoublyLinkedList;
import model.*;

public class Main {
	
	public static void main(String [] args) {
		
		/* Creation of the objects needed for testing */
		
		DoublyLinkedList itemStock = new DoublyLinkedList ();
		
		// Client client1 = new Client (001, "Jose Silva", "jose.silva@gmail.com");
			
		DVD dvd1 = new DVD (001, "abl", "Harry Potter", 29.90, 4, 140);
		DVD dvd2 = new DVD (002, "aalala", "Velozes e Furiosos", 24.90, 4, 112);
		Electronic electronic1 = new Electronic (003, "calalala", "Camera Fotografica", 915.00, "bivolt", "Nikon");
		Electronic electronic2 = new Electronic (004, "aaalelelalal", "Televis�o", 2799.00, "220", "Sony");
		Book book1 = new Book (005, "balalalalalalal", "Como programar Java", 180.0, 98231203, "Fulaninho", "Editora X", "Portugues", "Tecnicos", 855);
		
		/* Manipulating the stock with the list*/
		
		
		itemStock.addFirst(dvd1);
		itemStock.addFirst(dvd2);
		itemStock.addFirst(electronic1);
		itemStock.addFirst(electronic2);
		itemStock.addFirst(book1);
		
	
		/* Seeing the results */
		
		System.out.println(itemStock.toString());
		System.out.println(itemStock.listSize());
	
		itemStock.sort();
		
		System.out.println(itemStock.toString());

		
		itemStock.search("lalalala");
		
		
	
		
		
		
		
		
	}

}

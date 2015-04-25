package application;
import structure.DoublyLinkedList;
import model.*;

public class Main {
	
	public static void main(String [] args) {
		
		
		
		DoublyLinkedList itemStock = new DoublyLinkedList ();
		
		Client client1 = new Client (001, "Jose Silva", "jose.silva@gmail.com");
			
		
		DVD dvd1 = new DVD (001, "lalalala", "Harry Potter", 29.90, 4, 140);
		DVD dvd2 = new DVD (002, "lalalala", "Velozes e Furiosos", 24.90, 4, 112);
		Electronic electronic1 = new Electronic (003, "lalalala", "Camera Fotografica", 915.00, "bivolt", "Nikon");
		Electronic electronic2 = new Electronic (004, "lalalala", "Televisão", 2799.00, "220", "Sony");
		Book book1 = new Book (005, "lalalala", "Como programar Java", 180.0, 98231203, "Fulaninho", "Editora X", "Portugues", "Tecnicos", 855);
		
		itemStock.addFirst(dvd1);
		itemStock.addFirst(dvd2);
		itemStock.addFirst(electronic1);
		itemStock.addFirst(electronic2);
		itemStock.addFirst(book1);
		
		
		System.out.println(itemStock.toString());
	
		

		
		
		
	
		
		
		
		
		
	}

}

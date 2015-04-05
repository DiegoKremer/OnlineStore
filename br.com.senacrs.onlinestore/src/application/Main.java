package application;
import model.*;

public class Main {
	
	public static void main(String [] args) {
		
		Stock itemStock = new Stock ();
		
		
		Client client1 = new Client (001, "Jose Silva", "jose.silva@gmail.com");
		
		Cart cartclient1 = new Cart (client1);
		
		
		
		DVD dvd1 = new DVD (1, "Inspirado no livro...", "Harry Potter", 29.90, 4, 215);
		Item item1 = new Item (2, "Inspirado no livro...", "Harry Potter", 29.90);
		Electronic electronic1 = new Electronic (3, "Aquece rapidamente...", "Microondas", 415.00, "bivolt", "Brastemp");
		
		cartclient1.addItems(item1);
		cartclient1.addItems(dvd1);
		
		itemStock.addItem(dvd1);
		itemStock.addItem(item1);
		itemStock.addItem(electronic1);
		
		
		System.out.println(cartclient1);
		
		
	
	
		
		
		
	
		
		
		
		
		
	}

}

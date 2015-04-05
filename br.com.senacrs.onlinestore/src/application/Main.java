package application;
import model.*;

public class Main {
	
	public static void main(String [] args) {
		
		Stock itemStock = new Stock ();
		
		DVD dvd1 = new DVD (1, "Inspirado no livro...", "Harry Potter", 29.90, 4, 215);
		Item item1 = new Item (2, "Inspirado no livro...", "Harry Potter", 29.90);
		Electronic electronic1 = new Electronic (3, "Aquece rapidamente...", "Microondas", 415.00, "bivolt", "Brastemp");
		
		
		itemStock.addItem(dvd1);
		itemStock.addItem(item1);
		itemStock.addItem(electronic1);
		
		
		itemStock.displayItems();
		
		
	
	
		
		
		
	
		
		
		
		
		
	}

}

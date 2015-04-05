package model;

import java.util.Vector;

public class Stock {
	
	Vector<Item> itemStock = new Vector<Item> ();
	
	public Stock () {
		
	}
	
	public void addItem (Item item) {
		itemStock.addElement(item);
	}
	
	public void removeItem (Item item) {
		itemStock.removeElement(item);
	}
	
	public void displayItems () {
		 for (int index = itemStock.size() - 1; index >= 0; index--) {
			System.out.println(itemStock.get(index));
		 }
	}
	

}

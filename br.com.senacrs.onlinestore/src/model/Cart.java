package model;
import java.util.Vector;

class ItemCart {
	
	public Item item;
	public int amount;
	
	public ItemCart (Item item, int amount) {
		
		this.item = item;
		this.amount = amount;
		
	}
}

public class Cart {
	
	private ItemCart[] items;
	private Client client; 
	private int itemCount;
	


	public Cart (Client client) {
		this.client = client;
		items = new ItemCart[5];
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}

	
	public int getCount () {
		return itemCount;
	}
	
	
	public double getTotal () {
		double total = 0.0;
		for (ItemCart e: items) {
			if (e == null) break;
			total += e.item.getPrice() * e.amount;
		}
		return total;
	}
	
	
	public void addItem (Item item, int amount) {	
		for (ItemCart e : items)
		{
			if (e == null) break;
			if (e.item.compareTo(item) == 0) {
				e.amount += amount;
				return;
			}
		}
		if (itemCount == items.length)
			increaseCart();
		items[itemCount] = new ItemCart(item, amount);
		itemCount++;
	}


	private void increaseCart() {
		ItemCart[] newItemCart = new ItemCart[items.length * 2];
		System.arraycopy(items, 0, newItemCart, 0, items.length);
		items = newItemCart;
	
	}
	
	
	
	
	
	
	
	
	

	
	
}


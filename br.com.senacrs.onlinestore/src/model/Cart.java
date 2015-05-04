package model;
import java.util.Vector;

public class Cart {

	private Client client; // Variable to store the client owner of the cart.
	private Vector itemCart = new Vector(); // Variable to store the Items in the cart.
	private double price; // Variable to store the sum of the prices of the books.
	


	public Cart (Client c_client) {
		this.client = c_client;

	}


	public Client getCart_client() {
		return client;
	}


	public void setCart_client(Client cart_client) {
		this.client = cart_client;
	}

	
	public void addItems (Item item) {
		itemCart.add(item);
	}

	
	public void removeItems (Item item) {
		itemCart.remove(item);
	}
	
	
	public Item getCartItems () {
		return null;
		
	}

	

	public void setCart_price(double cart_price) {
		this.price = cart_price;
	}
	
	
	public String toString () {
		return "Cliente: "+client.getClient_name()+"\n"+"Items:"+"\n"+itemCart.toString();
	}

}


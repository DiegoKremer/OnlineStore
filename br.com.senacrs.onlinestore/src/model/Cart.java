package model;


/* Creates a class representing an Item of the cart. 
 * It consists of an Item and its amount. */

class ItemCart {
	
	public Item item;
	public int amount;

	public ItemCart (Item item, int amount) {
		
		this.item = item;
		this.amount = amount;
		
	}
}


/* The Cart class */

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
	
	/* Gets the total price of all the items 
	 * in the cart. */
	
	public double getTotal () {
		double total = 0.0;
		for (ItemCart e: items) {
			if (e == null) break;
			total += e.item.getPrice() * e.amount;
		}
		return total;
	}
	
	/* Loop through the item array, if the element is
	 * null it will break, otherwise it compares the 
	 * item parameter with the current element of the 
	 * array and if it is equal it will increment the
	 * amount. */
	
	public void addItem (Item item, int amount) {	
		for (ItemCart e : items)
		{
			if (e == null) break;
			if (e.item.compareTo(item) == 0) {
				e.amount += amount;
				return;
			}
		}
		
		/* If the items in the cart are equal to the 
		 * array length, it will increase the size of
		 * the cart and add the item as a new ItemCart. */
		
		if (itemCount == items.length)
			increaseCart();
		items[itemCount] = new ItemCart(item, amount);
		itemCount++;
	}

	/* Will increase the size of the cart by creating a copy
	 * twice as bigger. */

	private void increaseCart() {
		ItemCart[] newItemCart = new ItemCart[items.length * 2];
		System.arraycopy(items, 0, newItemCart, 0, items.length);
		items = newItemCart;
	
	}
	
	
	/* Will loop through the array comparing the Item parameter,
	 * if it finds and item equal will remove it */
	
	public void removeItem(Item item) {
		for (int i = 0; i < itemCount; ++i) {
			if (items[i].item.compareTo(item) == 0) {
				items[i] = items[itemCount-1];
				items[itemCount-1] = null;
				itemCount--;
				return;
			}
		}
	}
	
	
	/* Will search the array for an item equal to the
	 * one received on the parameter and if null will
	 * break, else will compare the elements from
	 * the array with the parameter and receive the
	 * new amount for that item. */
	
	public void modifyItem(Item item, int amount) {
		for (ItemCart i : items)
		{
			if (i == null) break;
			if (i.item.compareTo(item) == 0) {
				i.amount = amount;
				return;
			}
		}
	}
	
	
	/* Checks if provided Index is not out of bounds and
	 * if not returns the item on the provided index position
	 * of the Item array. */
	
	public Item getItem(int index) {
		if (index < 0 || index > itemCount)
			throw new ArrayIndexOutOfBoundsException("Invalid Index.");
		return items[index].item;
	}
	
	
	
	/* Checks if provided Index is not out of bounds and if not 
	 * returns the amount of the item provided index position
	 * of the Item array. */
	
	
	public int getItemAmount(int index) {
		if (index < 0 || index > itemCount)
			throw new ArrayIndexOutOfBoundsException("Invalid Index.");
		return items[index].amount;
	}
	

	
	
}


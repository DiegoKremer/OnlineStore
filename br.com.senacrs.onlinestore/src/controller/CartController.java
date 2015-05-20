package controller;

import view.View;
import model.Cart;
import model.Client;
import model.Item;

public class CartController {
	
	private Cart cart;
	private View view;
	
	public CartController (Client client) {
		this.cart = new Cart (client);
	}
	
	
	public void cartControl () {
		
		String msg;
		int count = cart.getCount();
		msg = String.format("Cart: R$ %03.2f (%d items)", cart.getTotal(), count);
		view.showMessage(msg);
		for (int i = 0; i < count; ++i) {
			Item e = cart.getItem(i);
			int amount = cart.getItemAmount(i);
			msg = String.format("%d - %s", amount, e.getDescription());
			view.showMessage(msg);
		} 
		
	}

}

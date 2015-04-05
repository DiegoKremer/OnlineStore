package model;

public class Purchase {

	private Cart cart;
	private int paymentMethod;


	public Purchase (Cart cart) {
		this.cart = cart;
	}



	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}


	public void choosePaymentMethod () {
		switch (paymentMethod) {
		case 1 : 

		}


	}

	public double showTotalValue (Cart cart) {
		return cart.getCart_TotalValue(cart);
	}

	public void completePurchaseCredit (Cart cart) {


	}

	public void completePurchasePaymentSlip (Cart cart) {



	}







}

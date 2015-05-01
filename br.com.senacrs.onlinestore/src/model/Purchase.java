package model;

public class Purchase {

	private Cart cart;


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


	}
	
	/*TODO:
	public double showTotalValue (Cart cart) {
		return cart.getCart_TotalValue(cart);
	}
	*/
	
	public void completePurchaseCredit (Cart cart) {
		

	}

	public void completePurchasePaymentSlip (Cart cart) {



	}







}

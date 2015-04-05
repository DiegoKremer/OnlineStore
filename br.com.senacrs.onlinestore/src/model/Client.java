package model;

public class Client {
	
	private int code;  // Variable used to store the client's unique code.
	private String name;  // Variable used to store the client's name.
	private String address;  // Variable used to store the client's address.
	private String phone;  // Variable used to store the client's phone.
	private String email;  // Variable used to store the client's email address.
	private Cart[] cart; // Variable used to store the client's carts.
	
	// Constructor with the three obligatory parameters (code, name and email).
	public Client (int c_code, String c_name, String c_email) {
		
		this.code = c_code;
		this.name = c_name;
		this.email = c_email;
		
	}
	
	// Constructor with all the variables. 
	public Client (int c_code, String c_name, String c_email, String c_address, String c_phone) {
		
		this.code = c_code;
		this.name = c_name;
		this.email = c_email;
		this.address = c_address;
		this.phone = c_phone;
		
	}
	
	// Below are the setters and getters.

	public int getClient_code() {
		return code;
	}

	public void setClient_code(int client_code) {
		this.code = client_code;
	}

	public String getClient_name() {
		return name;
	}

	public void setClient_name(String client_name) {
		this.name = client_name;
	}

	public String getClient_address() {
		return address;
	}

	public void setClient_address(String client_address) {
		this.address = client_address;
	}

	public String getClient_phone() {
		return phone;
	}

	public void setClient_phone(String client_phone) {
		this.phone = client_phone;
	}

	public String getClient_email() {
		return email;
	}

	public void setClient_email(String client_email) {
		this.email = client_email;
	}

	public Cart[] getClient_cart() {
		return cart;
	}

	public void setClient_cart(Cart[] client_cart) {
		this.cart = client_cart;
	}
	
	
	
	
	

}

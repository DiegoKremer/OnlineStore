package model;

public class Client {
	
	private int code;  // Variable used to store the client's unique code.
	private String name;  // Variable used to store the client's name.
	private String address;  // Variable used to store the client's address.
	private String phone;  // Variable used to store the client's phone.
	private String email;  // Variable used to store the client's email address.
	
	
	/* Constructors */
	
	public Client () {
		
	}
	
	
	public Client (int code, String name, String email) {
		
		this.code = code;
		this.name = name;
		this.email = email;
		
	}
	
	
	public Client (int c_code, String c_name, String c_email, String c_address, String c_phone) {
		
		this.code = c_code;
		this.name = c_name;
		this.email = c_email;
		this.address = c_address;
		this.phone = c_phone;
		
	}
	
	
	// Below are the setters and getters.

	public int getCode() {
		return code;
	}

	public void setCode(int client_code) {
		this.code = client_code;
	}

	public String getName() {
		return name;
	}

	public void setName(String client_name) {
		this.name = client_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String client_address) {
		this.address = client_address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String client_phone) {
		this.phone = client_phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String client_email) {
		this.email = client_email;
	}

}

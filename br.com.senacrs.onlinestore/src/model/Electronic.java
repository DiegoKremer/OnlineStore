package model;

public class Electronic extends Item {

	private String brand;
	private String voltage;
	
	
	public Electronic (int code, String description, String name, double price, String volt, String brand) {
		super(code, description, name, price);
		this.voltage = volt;
		this.brand = brand;
	}

	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getVoltage() {
		return voltage;
	}


	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

	
	
}

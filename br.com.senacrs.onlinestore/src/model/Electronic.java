package model;

public class Electronic extends Item {

	private String brand;
	private String voltage;
	
	/* Constructor */
	
	public Electronic (int code, String description, String name, double price, String volt, String brand) 
	{
		super(code, description, name, price);
		this.voltage = volt;
		this.brand = brand;
	}

	
	/* Sets and Gets */
	
	public String getBrand() 
	{
		return brand;
	}


	public void setBrand(String brand) 
	{
		this.brand = brand;
	}


	public String getVoltage() 
	{
		return voltage;
	}


	public void setVoltage(String voltage) 
	{
		this.voltage = voltage;
	}

	
	
}

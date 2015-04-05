package model;

public class DVD extends Item{
	
	private int region;
	private int length;
	
	public DVD (int code, String description, String name, double price, int region, int length) {
		super(code, description, name, price);
		this.region = region;
		this.length = length;
		
	}
	
	

	public int getRegion() {
		return region;
	}

	public void setRegion(int region) {
		this.region = region;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	

}

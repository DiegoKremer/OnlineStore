package model;

public class Item {
	
	private int code;
	private String description;
	private String name;
	private double price;
	

	public Item(int code, String description, String name, double price) {
		this.code = code;
		this.description = description;
		this.name = name;
		this.price = price;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice () {
		return price;
	}
	
	public String toString () {
		
		return "Codigo: "+code+" - "+"Item: "+name +" - "+"Descricao: "+description+" - "+"Preco: "+price;
		
	}
	
	

}

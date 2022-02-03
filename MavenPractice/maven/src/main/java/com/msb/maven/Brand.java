package com.msb.maven;


public class Brand {
	
	private String name;
	private String price;
	
	Brand(String price)
	{
		this.price=price;
	}
	
	Brand(String name, String price)
	{
		this.name=name;
		this.price=price;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Brand [name=" + name + ", price=" + price + "]";
	}
	
	

}

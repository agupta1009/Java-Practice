package com.msb.design.composite;

public class leaf implements component {

	String name;
	
	public leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	int price;
	@Override
	public void show_price() {
		// TODO Auto-generated method stub
		System.out.println(name+ " "+price);

	}

}

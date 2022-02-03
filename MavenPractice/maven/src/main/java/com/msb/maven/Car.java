package com.msb.maven;

public class Car extends Vehicle {

	private Brand b;
	
	
	public Brand getB() {
		return b;
	}


	public void setB(Brand b) {
		this.b = b;
	}


	public void drive()
	{
		System.out.println("car is running");
	}
}

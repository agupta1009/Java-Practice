package com.msb.maven;

public class Bike extends Vehicle {

	
	private Brand b;
	
	public Brand getB() {
		return b;
	}

	@Override
	public String toString() {
		return "Bike [b=" + b + "]";
	}

	public void setB(Brand b) {
		this.b = b;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Bike is driving");

	}

}

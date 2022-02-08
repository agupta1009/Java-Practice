package com.msb.maven;

import org.springframework.beans.factory.BeanNameAware;

public class Bike implements Vehicle, BeanNameAware{

	
	private Brand b;
	
	public Brand getB() {
		return b;
	}

	@Override
	public String toString() {
		return "Bike [b=" + b + "]";
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);
		
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

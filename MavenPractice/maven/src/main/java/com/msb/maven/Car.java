package com.msb.maven;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car implements Vehicle, InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" method called after bean dead.....        work like bean destructor");
		
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(" method callled before bean creation....      works like bean constructor");

	}


	private Brand b;
	
	
	public Brand getB() {
		return b;
	}


	@Override
	public String toString() {
		return "Car [b=" + b + "]";
	}


	public void setB(Brand b) {
		this.b = b;
	}


	public void drive()
	{
		System.out.println("car is running");
	}
}

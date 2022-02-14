package com.msb.design.prototype;

public class details  implements get_clone, Cloneable{
	String name;
	String email;
	String password;
	
	
//	fetching the data from database by name
	
	
	
	
	@Override
	public Object getClone() {
		
//		shallow copy
//		return this;
		
//		deep copy
		return (details) new details();
		
		
	}

}

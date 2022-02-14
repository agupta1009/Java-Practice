package com.msb.design.composite;

import java.util.ArrayList;
import java.util.List;

public class composite implements component {

	String name;
	
	List<component> l=new ArrayList<>();
	
	public void add(component c)
	{
		l.add(c);
	}
	
	
	
	
	
	public composite(String name) {
		super();
		this.name = name;
	}





	@Override
	public void show_price() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
		for(component c:l)
		{
			c.show_price();
		}
		
	}

}

package com.msb.maven;

import org.springframework.context.ApplicationEvent;

public class customEvent extends ApplicationEvent{

	public customEvent(Object source) {
		
//		source will be the class from where is is called
		super(source);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString()
	{
		return "Event handler to string";
	}

}

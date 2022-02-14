package com.msb.design.adapter;

public class remote_demo{
	
	private String type;
	remote_demo(String type)
	{
		super();
		this.type=type;
	}
	
	void setVolume() {
		new remote_adapter().setVolume(this.type);
		
	}
	

}

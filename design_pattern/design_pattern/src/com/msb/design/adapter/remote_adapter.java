package com.msb.design.adapter;

public class remote_adapter implements remote{

	public void setVolume(String name) {
		// TODO Auto-generated method stub
		if(name=="dvd")
		{
			new dvd().setVolume_dvd();
		}
		else if(name=="home theator")
		{
			new home_theator().setVolume_hometheator();
		}
		else if(name=="tv")
		{
			new tv().setVolume(name);
		}
		else
		{
			System.out.println("unsupported remote");
		}
		
	}

}

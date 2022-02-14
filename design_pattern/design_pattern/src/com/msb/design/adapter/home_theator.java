package com.msb.design.adapter;

public class home_theator implements advanced_remote {

	@Override
	public void setVolume_dvd() {
//		do nothing
	}

	@Override
	public void setVolume_hometheator() {
		System.out.println("volume set: home theator");
	}

}

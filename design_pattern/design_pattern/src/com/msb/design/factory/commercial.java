package com.msb.design.factory;

public class commercial implements bill {

	@Override
	public int calculate_bill(int units) {
		// TODO Auto-generated method stub
		return units*10+250;
	}

}

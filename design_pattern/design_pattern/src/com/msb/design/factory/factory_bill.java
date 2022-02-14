package com.msb.design.factory;

public class factory_bill {
	
	public static bill get_instance(String name)
	{
		if(name==null)
		{
			return null;
		}
//		remember not to use name=="commercial"    string pool concept   it will compare the adress   use .equals()
		else if(name.equals("commercial"))
		{
			System.out.println("in commerical");
			return new commercial();
		}
		else {
			System.out.println("in domestic");
			return new domestic();

		}
	}

}

package com.msb.java.jdbc;

//import java.lang.Class;


public class checkInstance {

	public static void main(String[] args) throws ClassNotFoundException  {

		Class.forName("myclass");
	}

}


class myclass{
	static {
		System.out.println("i am in static function");
	}
	
	{
		System.out.println("i am in normal function");
	}
	
}

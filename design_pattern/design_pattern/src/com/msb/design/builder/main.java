package com.msb.design.builder;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		difficult to remeber and pass
//		phone p=new phone(8,50,"snapdragon","android",5000);
		phone p=new builder().setCamera(50).setOs("android").getphone();
		System.out.println(p);

	}

}

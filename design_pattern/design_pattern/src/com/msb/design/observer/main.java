package com.msb.design.observer;

public class main {

	public static void main(String[] args) {

		channel ch=new channel("java practice");
		subscriber s1=new subscriber("s1").subscibe(ch);
		subscriber s2=new subscriber("s2").subscibe(ch);
		channel ch2=new channel("java tut");
		s2.subscibe(ch2);
		ch.upload();
		ch2.upload();
		
	}

}

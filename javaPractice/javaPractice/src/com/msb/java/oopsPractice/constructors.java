package com.msb.java.oopsPractice;

class base{
//	var args
	base(int ...a)
	{
		System.out.println("in base class with argument" + "");
		for(int x:a)
		{
			System.out.println(x);
		}
	}
	base()
	{
		System.out.print("in base class");
	}
	void func(int a)
	{
		System.out.println("in base func");
	}
}

class derived extends base{

	public derived() {
//		super(9,8,7,6);

		System.out.println("in derived class");
	}

	@Override
	void func(int a) {
		System.out.println("in derived class func");
	}
}


public class constructors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derived d=new derived();
		d.func(2);
		base b=new base();
		b.func(2);
		base b1=new derived();
		b1.func(2);
	}

}

package com.msb.java.passbyRefrence;

class student{
	int j;
	student(){
		
	}
	
	void set(int j)
	{
		this.j=j;
	}
	int function(int i)
	{
		i++;
		System.out.println("int: "+i);
		return i;
	}
	int function(student s)
	{
		s.j++;
		System.out.println("object:"+s.j);
		return s.j;
		
	}
	
	Integer function(Integer i)
	{
		i=i+1;
		System.out.println("integer:"+i);
		return i;
	}
	
}




public class passReference {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		call by value
		int i=0;
		System.out.println(i);
		student s=new student();
		s.function(i);
		System.out.println(i);
		
//		call by reference
		System.out.println("......................");
	student s1=new student();
	s1.set(0);
	System.out.println(s1.j);
	s1.function(s1);
	System.out.println(s1.j);
	System.out.println(".............................");
	
	student s2=new student();
	Integer m=0;
	System.out.println(m);
	s2.function(m);
	System.out.println(m);
		
		
		
		
		
	}

}

package com.msb.java.filehandling;
import java.io.*;
import java.util.*;

public class file_handling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
//		............................................code  for creating a file
		File myfile=new File("hello.txt");
//		myfile.createNewFile();
		String msg="Hello, this si the class of java \n hi this is the class for java \t this will be the class \n and will remain for java";
//		
		
//		...............................................code for writing a content in a file
		
//		FileWriter fileWriter=new FileWriter(myfile);
//		fileWriter.write(msg);
//		fileWriter.close();
//		
		
//		..............................................code for reading a file
		
//		Scanner sc=new Scanner(myfile);
//		while(sc.hasNextLine())
//		{
//			System.out.println(sc.nextLine());
//		}
//		sc.close();
		
//		..............................................code for appending a msg in a file
		FileWriter fileWriter=new FileWriter(myfile,true);
		String msg2=" hello i am \n ankush and this is the \n file being created \n by me \n ";
		fileWriter.write(msg2);
		fileWriter.close();
		
		Scanner sc=new Scanner(myfile);
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();

	}

}

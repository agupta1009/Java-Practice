package com.msb.java.filehandling;
import java.util.*;
import java.io.*;
public class filehandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File filename=new File("hello1.txt");

			Scanner sc=new Scanner(filename);
			while(sc.hasNextLine())
			{
				System.out.println(sc.nextLine().replaceAll("\s",""));

			}
			sc.close();
		
	

	}

}

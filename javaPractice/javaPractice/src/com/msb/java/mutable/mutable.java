package com.msb.java.mutable;

import java.util.Arrays;

public class mutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		StringBuffer s = new StringBuffer("ankush");
		StringBuffer s1 = s;

		s1.append("gupta");
		System.out.print(s);
		int arr[] = { 1, 2, 3, 4, 5 };
		int b[] = arr;
		b[0] = 5;
		System.out.println(Arrays.toString(arr));

	}

}

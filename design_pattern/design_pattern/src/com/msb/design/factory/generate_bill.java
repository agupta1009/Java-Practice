package com.msb.design.factory;

import java.util.*;

public class generate_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the type of account");
		String type = sc.nextLine();
		bill b = factory_bill.get_instance(type);
		System.out.println("Eneter the no. of units used");
		int units = sc.nextInt();
		System.out.println(b.calculate_bill(units));
		sc.close();
		

	}

}

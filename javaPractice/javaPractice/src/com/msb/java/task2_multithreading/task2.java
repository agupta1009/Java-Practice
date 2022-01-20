package com.msb.java.task2_multithreading;

import java.util.*;
import java.io.*;
import java.util.concurrent.*;

interface hexvalue {
	String hexaconverter(int data);
}

class MyThread extends Thread {
	private String filename = "output.txt";
	private int data;
	static hexvalue converted_data = (data) -> Integer.toHexString(data);

	MyThread(int data) {
		this.data = data;
	}

	@Override
	public void run() {
		try {
//			true here is used to open file in append mode
			FileWriter fileWriter = new FileWriter(this.filename, true);
			fileWriter.write("key: " + data + ", value: " + converted_data.hexaconverter(data) + "\n");
			fileWriter.close();

		} catch (Exception e) {
			System.out.println("Exception occured");
		}

	}
}

public class task2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File myfile = new File("input.txt");
		Scanner sc = new Scanner(myfile);
		ExecutorService pool = Executors.newFixedThreadPool(5);
		while (sc.hasNextLine()) {
//			replace all the spaces with ""
			String str = sc.nextLine().replaceAll("\s", "");
//			convert str to integer
			int data = Integer.parseInt(str);
			MyThread t = new MyThread(data);
			pool.execute(t);

		}
		sc.close();
		pool.shutdown();
	}

}

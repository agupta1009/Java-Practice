package com.msb.java.task1_multithreading;

class MyThread1 extends Thread {
	StringBuffer str;

	MyThread1(StringBuffer s) {
		str = s;
	}

	public void run() {
		int i = 0;
		while (i < 1000) {
			str.append("t1_");
			i++;

		}
	}
}

class MyThread2 extends Thread {
	StringBuffer str;

	MyThread2(StringBuffer s) {
		str = s;
	}

	public void run() {
		int i = 0;
		while (i < 1000) {
			str.append("t2_");
			i++;
		}
	}
}

public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("");
		MyThread1 t1 = new MyThread1(str);
		MyThread2 t2 = new MyThread2(str);
		t1.start();
		t2.start();
		try {
			t1.join(100);
			t2.join(100);
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println(str);

	}

}

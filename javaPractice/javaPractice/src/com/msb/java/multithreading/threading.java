package com.msb.java.multithreading;

//threading by extending the thread class

class MyThread1 extends Thread {

	public void run() {
		int i = 0;
		while (i < 10) {
			i++;

		}
		System.out.println("in thread 1");
	}

}

class MyThread2 extends Thread {

	public void run() {
		int i = 0;
		while (i < 10) {
			i++;
		}
		System.out.println("in thread 2");
	}
}

class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}

	public void run() {
//		int i = 0;
//		while (i < 500) {
//			System.out.println(" parametrized constructor thread ");
//			i++;
//		}
	}
}

public class threading {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();

		System.out.println(t1.getName());
		System.out.println(t2.getName());

		MyThread t = new MyThread("New Thread");// constructor in thread
		t.start();
		System.out.println("name:" + t.getName());

		System.out.println(t.getId());
		System.out.println(t.isAlive());

		System.out.println(t1.getName());

		System.out.println(t1.getId());
		System.out.println(t2.getName());

		System.out.println(t2.getId());

	}

}

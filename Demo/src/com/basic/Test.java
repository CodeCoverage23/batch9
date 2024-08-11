package com.basic;

public class Test implements Runnable {

	@Override
	public void run() {
		System.out.println("run. ");

	}

	public static void main(String[] args) {

		Thread t = new Thread(new Test());

		t.start();
		System.out.println("EOM");
	}
}

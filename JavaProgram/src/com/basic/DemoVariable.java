package com.basic;

public class DemoVariable {

	int a = 10; // instance variable
	static int c; // static variable

	public static void main(String[] args) {

		int b = 10; // local variable
		c = 5;

		// a = 20; this is not a static variable
	}

	public void method() {
		// b = 5; is not accessible here

		c = 4;
	}

}
package com.basic.method;

public class MethodDemo {
	
	public static final String PAN_CARD = ""; //constant

	int a = 10;

	public static void main(String[] args) {

		MethodDemo m = new MethodDemo();

		m.add();

		m.add2(12, 44);

		int d = m.add3();
		System.out.println(d);
	}

	// simple method
	public void add() {
		System.out.println("Simple Method");
	}

	// with parameter
	public void add2(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	// with return type
	public int add3() {
		int c = 10 + 12;
		return c;
	}
	
	public void addOfTwoNumbers() {
		
	}

}

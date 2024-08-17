package com.oops.concepts;

public class MethodOverloadingDemo {

	public static void main(String[] args) {

		MethodOverloadingDemo demo = new MethodOverloadingDemo();

		demo.add(11, 22);
		demo.add(11, 22, 33);

		demo.operation(55, 44);
		demo.operation(4, 8.1f);
		demo.operation(66, 12, true);

	}

	public static void main(String args) {

		System.out.println(args);

	}

	public static void main(int a) {

		System.out.println(a);

	}

	// Rule 1 : Method overloading with number of parameters

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	// Rule 2: Method overloading with Data type of parameters

	public void operation(int a, int b) {
		System.out.println(a - b);
	}
	
	public void operation(int a, float b) {
		System.out.println(a * b);
	}

	public void operation(int a, double b, boolean d) {
		if (d) {
			System.out.println(b + 2);
		} else
			System.out.println(a * b);
	}

	/*
	 * Method overloading is not possible by changing return type of the method
	 * public int operation(int a, float b) { return a * b; }
	 */

}

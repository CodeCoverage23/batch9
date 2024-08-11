package com.basic;

public class StaticMethodDemo {

	public static void main(String[] args) {

		StaticMethodDemo.calculate(11, 4);

	}

	public static void calculate(int a, int b) {
		int c = a + b;
		System.out.println("A + B = " + c);

		int d = a - b;
		System.out.println("A - B = " + d);

		int e = a * b;
		System.out.println("A * B = " + e);

		double f = a / b;

		System.out.println("A / B = " + f);
		System.out.println(a % b);

	}

}

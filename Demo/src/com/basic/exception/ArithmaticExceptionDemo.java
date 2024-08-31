package com.basic.exception;

public class ArithmaticExceptionDemo {

	public static void main(String[] args) {

		try {
			int data = 10;
			int a = 0;
			int c = data / a;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero not possible");
			System.out.println(e.getMessage());

		}

		System.out.println("Rest of the code..");

	}

}

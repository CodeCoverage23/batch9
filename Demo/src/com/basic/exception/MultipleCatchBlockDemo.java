package com.basic.exception;

/**
 * First child class and then parent classes in the catch blocks
 */
public class MultipleCatchBlockDemo {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);

			String s = null;
			System.out.println(s.length());

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("Rest of the code...");
	}

}

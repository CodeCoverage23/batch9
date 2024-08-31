package com.basic.exception;

public class FinallyBlockDemo {

	public static void main(String[] args) {

		try {

			System.out.println(10 / 0);

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Always Execute");
		}

		System.out.println("Rest of the code...");

	}

}

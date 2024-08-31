package com.basic.exception;

public class ThrowDemo {

	public static void main(String[] args) {

		int age = 20;

		if (age < 18) {
			throw new RuntimeException("You are not eligible for Vote");
		} else {
			System.out.println("You can vote...");
		}

	}

}

package com.basic;

public class IfBlockDemo {

	public static void main(String[] args) {

		int age = 12;

		if (age >= 16) {
			System.out.println("Can apply for PAN");
			if (age >= 18) {
				System.out.println("Can Vote...");
			}
		} else {
			System.out.println("User age is not applicable");
		}
	}

}

package com.rishi.assignments.Assingment_7;

import java.util.Scanner;

public class Validate {

	public void check(char c) {
		if (Character.isLetter(c)) {
			System.out.println("It's a alphabet");
		} else if (Character.isDigit(c)) {
			System.out.println("It's a digit");
		} else {
			System.out.println("It's a special symbol");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character");
		String s = sc.next();

		Validate v = new Validate();

		if (s.length() != 1) {
			System.out.println("Please enter a single character!!");
		} else {
			char ch = s.charAt(0);
			v.check(ch);
		}

	}

}

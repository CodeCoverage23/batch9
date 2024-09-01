package com.rishi.assignments.Assigment_2;

import java.util.Scanner;

public class FirstChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = sc.next();
		sc.close();

		char s = str.charAt(0);
		System.out.println("First character is :" + s);
	}

}

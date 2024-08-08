package com.java.program;

import java.util.Scanner;

public class PrintNameWithMultiple {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number top genarate series>>");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i + " pradeep patankar");

			} else if (i % 5 == 0) {

				System.out.println(i + " pradeep");
			} else if (i % 7 == 0) {
				System.out.println(i + " patankar");
			} else {
				System.out.println(i);
			}

		}

	}

}

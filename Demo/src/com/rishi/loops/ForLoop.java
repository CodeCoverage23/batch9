package com.rishi.loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		int num, i, tab;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for printing table :");
		num = sc.nextInt();

		System.out.println("Table of " + num);
		for (i = 1; i <= 10; i++) {

			tab = num * i;
			System.out.println(tab);
		}

	}

}

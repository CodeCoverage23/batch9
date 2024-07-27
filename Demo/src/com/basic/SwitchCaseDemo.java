package com.basic;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();

		switch (number) {
		case 0:
			System.out.println("ZERO");
			break;
		case 1:
			System.out.println("POSITIVE");
			break;
		case -1:
			System.out.println("NEGATIVE");
			break;
		default:
			System.out.println("Invalide value");

		}

	}

}

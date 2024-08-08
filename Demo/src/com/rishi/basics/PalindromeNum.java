package com.rishi.basics;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();

		int orgNum = num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (orgNum == rev) {
			System.out.println("The number" + orgNum + "is palindrome number..");
		} else {
			System.out.println("The number" + orgNum + "is not palindrome number..");
		}

	}

}

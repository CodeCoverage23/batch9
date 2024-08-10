package com.java.program;

import java.util.Scanner;

// WAP to check given number is palindrome number or not 
// palindrome number are those number when we reverse so it will give same number.
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number to check palindrome number>>");

		int number = sc.nextInt();

		int orgNumber = number;

		int rev = 0;
		while (number != 0) { // 12//1
			rev = rev * 10 + number % 10; // 0*10 + 123%10=0+3=3 // 3*10 +12%10=30 +2=32// 32*10 +1%10=320+1=321
			number = number / 10; // 123/10=12 // 12/10=1// 1/10=0
		}

		if (orgNumber == rev) {

			System.out.println("the number " + orgNumber + " is palindrome number");
		} else {
			System.out.println("the given number " + orgNumber + " is not a palindrome number");
		}

	}

}
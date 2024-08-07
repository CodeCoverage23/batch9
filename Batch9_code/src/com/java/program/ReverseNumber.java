package com.java.program;

import java.util.Scanner;

// wap to reverse a given number ex. 3476===> 6743  123===> 321
public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter a number to reverse>>");
		
		int number = sc.nextInt();
		
		int rev=0;
		while(number!=0) {               // 12//1
			rev=rev*10 + number%10;     // 0*10 + 123%10=0+3=3 // 3*10 +12%10=30 +2=32// 32*10 +1%10=320+1=321
			number=number/10;          // 123/10=12 // 12/10=1// 1/10=0
		}
		
		System.out.println("reverse number is : "+rev);
		
	}

}

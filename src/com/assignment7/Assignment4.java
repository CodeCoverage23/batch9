package com.assignment7;
import java.util.Scanner;

public class Assignment4 {
	
	static int rev,num,digit,res;
	
	public int getReverseNumber(int num) {
		rev = 0;
		while(num != 0) {
			digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Assignment4 assig = new Assignment4();

		System.out.println("Enter a number: ");
		num = sc.nextInt();

		res = assig.getReverseNumber(num);
		System.out.println("The reverse of " + num + " is: " + res);

		 sc.close();


	}

}

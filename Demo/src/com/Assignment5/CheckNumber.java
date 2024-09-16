package com.Assignment5;

import java.util.Scanner;

//1.write a program to check the number is positive or negative.
public class CheckNumber {
	public static void checkNumber(int n) {
		if(n>=0) {
			System.out.println(n+" is a positive number");
		}
		else if(n<=0) {
			System.out.println(n+" is a negative number");
		}
		else {
			System.out.println("it is zero");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		checkNumber(n);
	}

}

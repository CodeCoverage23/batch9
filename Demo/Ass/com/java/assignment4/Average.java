package com.java.assignment4;

//Write the Java Program to calculate total of five subject marks and average of it.

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);

		System.out.println("Enter the marks of 5 subjects : ");

		int English = Sc.nextInt();
		int Hindi = Sc.nextInt();
		int Maths = Sc.nextInt();
		int Science = Sc.nextInt();
		int Social = Sc.nextInt();

		int sum = English + Hindi + Maths + Science + Social;
		System.out.println("Total marks : " + sum);

		int avg = sum / 5;
		System.out.println("Average marks : " + avg);

	}

}

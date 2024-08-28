package com.assignment;
import java.util.Scanner;

public class Assignment5_1 {

	public static void main(String args[]) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check :");
		num = sc.nextInt();
		
		if(num>=0)
		{
			System.out.println("The number is positive");
		}
		else
		{
			System.out.println("The number is negative");
		}
	}
}

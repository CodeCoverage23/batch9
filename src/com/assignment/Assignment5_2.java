package com.assignment;
import java.util.Scanner;

public class Assignment5_2 {

public static void main(String args[]) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the year to check :");
		num = sc.nextInt();
		
		if(num%4==0 || num%100==0)
		{
			System.out.println("The year is leap year");
		}
		else
		{
			System.out.println("The year is not leap year");
		}
	}

}

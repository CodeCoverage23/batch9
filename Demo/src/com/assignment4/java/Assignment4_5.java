package com.assignment4.java;

import java.util.Scanner;

public class Assignment4_5 {
	
	// calculate total of five subject marks and average of it.
	
static int k1,k2,k3,k4,k5,total,avg;
	
	public int add() {
		total = k1+k2+k3+k4+k5;
		return total;
	}
		public int avg() {
		avg =total/5;
		return avg;
	}

	public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);

		Assignment4_5 a10=new Assignment4_5();
		
		System.out.println("Enter the marks to be calculate");

		k1 = sc.nextInt();
		k2 = sc.nextInt();
		k3 = sc.nextInt();
		k4 = sc.nextInt();
		k5 = sc.nextInt();
		
		System.out.println("Addition of total marks :" +(a10.add()));
		
		System.out.println("Average of total percentage :" +(a10.avg()));


	}

}

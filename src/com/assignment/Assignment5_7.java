package com.assignment;

import java.util.Scanner;

public class Assignment5_7 {

	public  int sqrnum(int num) {
		int res=num*num;
		return res;
	}
	public static void main(String args[]) 
	{
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number : " );
		int num= s.nextInt();
		
		Assignment5_7 a57 =new Assignment5_7();
		
		System.out.println("Square ofthe entered number is " +(a57.sqrnum(num)));
		
	}
}

package com.java.program;

import java.util.Scanner;

//WAP to generate fibonacci series 
//fibonacci is start from 0 and 1 , next number in series is generated by addition of previous two number.
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1=0; int n2=1; int sum=0;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter a limit to genearate the fibonacci series>>");
		 int num = sc.nextInt();
		
		 System.out.print(n1+" "+n2);
		 
		 for(int i=2; i<=10;i++) {
			 
			 sum=n1+n2; // 0+1=1//1+1=2
			 System.out.print(" "+sum);
			 n1=n2;  //n1=1//n1=1
			 n2=sum; //n2=1//n2=2
		 }
		
		
		
		
		
		

	}

}
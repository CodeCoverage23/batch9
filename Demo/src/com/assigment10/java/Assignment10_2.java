package com.assigment10.java;

import java.util.Scanner;

public class Assignment10_2 {
	
//WAP to display the Fibonacci series up to given number.
	
	public static void main(String[] args) {
		
		int n1=0; int n2=1; int sum=0;
		
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("enter a limit to genearate the fibonacci series -->");
		 
		 int n = sc.nextInt();
		
		 System.out.print(n1+" "+n2);
		 
		 for(int i=2; i<=10;i++) {
			 
			 sum=n1+n2; 
			 
			 System.out.print(" "+sum);
			 
			 n1=n2;  
			 
			 n2=sum; 
		 }
		

	}

}

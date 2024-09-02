package com.assignment5.java;

import java.util.*;

public class Assignment5_8 {
	//Write a program to swap the two numbers.

	public static void main(String[] args) {
	
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of A & B");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Before swapping the number is --"+a + " "+ b);
		
		c= a; 
		a= b;
		b= c;
		
		System.out.println("After swapping the number is --"+ a+ " "+b);
		
		System.out.println();
		
	}

}

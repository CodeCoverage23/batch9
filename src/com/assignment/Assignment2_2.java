package com.assignment;
import java.util.Scanner;

public class Assignment2_2 {
	
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a string to check first character");
		String str = sc.next();
		
		char first = str.charAt(0);;
		
		System.out.println("First letter of string is :" +first);
		
	}

}

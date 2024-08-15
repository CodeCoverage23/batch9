package com.pallavi.basics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr a string: ");
		String str = sc.next();
		String rev = "";
		int length = str.length();
		System.out.println("String before reverse: ");
		System.out.println(str);
		sc.close();
		
		for(int i= length-1; i>0; i--) {
			
			rev = rev + str.charAt(i);
		}
		System.out.println("String after reverse:");
		System.out.println(rev);
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}



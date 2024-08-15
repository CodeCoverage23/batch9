package com.java.program;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string>>");
		String str = sc.next();
		String rev="";
		int length = str.length();	
		System.out.println("string before reverse>>");
		System.out.println(str);
		
//		for(int i=length-1;i>=0;i--) {
//			
//			rev=rev+str.charAt(i);	
//			
//		}
		
		StringBuffer bf= new StringBuffer(str);
		StringBuffer reverse = bf.reverse();
		
		System.out.println("string After reverse>>");
		System.out.println(reverse);
		
		
		
		
	}

}

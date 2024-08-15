package com.java.program;

import java.util.Scanner;

public class PalindromeStirng {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string>>");
		String str = sc.next();
		String rev="";
		int length = str.length();	
         
		
		for(int i=length-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);	
			
		}
		 if(rev.equals(str)) {
			 
			 System.out.println("string is palindrome");
			 
		 }else {
			 
			 System.out.println("string is not palindrome");
		 }
		
		
		
	}

}
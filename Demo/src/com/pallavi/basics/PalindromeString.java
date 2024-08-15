package com.pallavi.basics;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr a string: ");
		String str = sc.next();
		String rev = "";
		int length = str.length();
		
		sc.close();
		
		for(int i= length-1; i>0; i--) {
			
			rev = rev + str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		
		
	}

}

package com.Assignment19;

import java.util.Scanner;

//2. Design the java method for String getReverseString(String reverse) and take the input from user 
//into main method and pass to that method. Result will print into main method
public class Que2 {
	public static String reverse(String s) {
		String rev ="";
		for(int i=s.length()-1;i>=0;i--) {
			rev += s.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Reverse Of "+s+ " : "+reverse(s));
		

	}

}

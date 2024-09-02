package com.Assignment7.java;

import java.util.Scanner;

public class Assignment7_2 {
	
	//public int getNumberCube(int num), return int value to that method and result should be into main method.

	public static void main(String[] args) {
		
		int n = 5;
		
	      System.out.println("Enter a number --");
	      
	      Scanner sc = new Scanner(System.in);
	      
	      int num = sc.nextInt();
	      
	      System.out.println("Cube of the given number is "+(num*num*num));

	}

}

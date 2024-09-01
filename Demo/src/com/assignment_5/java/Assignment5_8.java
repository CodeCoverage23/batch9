package com.assignment_5.java;

  //Swap the two numbers

import java.util.Scanner;

public class Assignment5_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers (x and y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        // Swap without using a temporary variable
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

	}
	
}

package com.assignment_5.java;

  //Find out maximum number among three number using if else if ladder statement

import java.util.Scanner;

public class Assignment5_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
		int maxNumber;
		
		if(num1 >= num2 && num1 >= num3) {
			maxNumber = num1;
			
		}
		else if(num2 >= num1 && num2 >= num3) {
			maxNumber = num2;
			
		}
		else {
			maxNumber = num3;
		}
		
		System.out.println("The maximum number is: " + maxNumber);
		
	}

}

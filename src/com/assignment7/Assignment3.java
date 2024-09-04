package com.assignment7;
import java.util.Scanner;

public class Assignment3 {

	static int num1,res,i;
	public void printFactor(int num1) {
		System.out.println("Factor of " + num1 + " are: ");
		for(i =1; i <= num1; i++) {
			if(num1 % i == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println();//for a new line after printing all factor 
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Assignment3 assig = new Assignment3();

		System.out.println("Enter the number: ");
		int num1 = sc.nextInt();

		assig.printFactor(num1);
		sc.close();
	}

}

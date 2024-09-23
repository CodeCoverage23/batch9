package com.assignments;
import java.util.Scanner;
/*
 * design method void multiplication (int no) 
 * and print the multiplication table
 */
public class Assignment6_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		multi(num);
	}
	public static void multi(int no) {
		for(int i = 1; i <= 10; i++) {
			System.out.println(no + " * " + i + " = " +(no * i));
		}
		
		
		
		
	}
}
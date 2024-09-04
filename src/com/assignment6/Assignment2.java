package com.assignment6;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
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

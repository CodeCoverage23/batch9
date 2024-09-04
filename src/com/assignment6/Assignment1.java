package com.assignment6;
import java.util.Scanner;


public class Assignment1 {

	static int num;
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check :");
		num = sc.nextInt();
		
		while(num<=50) {

		System.out.println(num);
		num++;
	}

	}	
}

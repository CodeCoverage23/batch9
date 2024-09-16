package com.Assignment5;
//5. Write a program to check whether number is even or odd.
import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n+" is a even number ");
		}
		else {
			System.out.println(n+" is a odd number ");
		}

	}

}

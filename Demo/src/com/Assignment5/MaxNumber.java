package com.Assignment5;
//3.write a program to find out maximum number among three number(if else if ladder statement)
import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("Maximum Number : "+a);
		}
		else if(b>c && b>a) {
			System.out.println("Maximum Number : "+b);
		}
		else {
			System.out.println("Maximum Number : "+c);
		}

	}

}

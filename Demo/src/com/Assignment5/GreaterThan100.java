package com.Assignment5;

import java.util.Scanner;

//6. Write the program to check whether the no is greater than 100.
public class GreaterThan100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>100) {
			System.out.println(n +" is greater than 100");
		}
		else if(n<100) {
			System.out.println(n + " is smaller than 100");
		}
		else {
			System.out.println("it is 100");
		}

	}

}

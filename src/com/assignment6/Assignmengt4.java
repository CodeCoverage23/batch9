package com.assignment6;
import java.util.Scanner;

public class Assignmengt4 {

	static int num,res,i;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = sc.nextInt();
		sc.close();

		res = factorial(num);
		System.out.println("The factorial of " + num + " is " + res);
	}
	public static int factorial(int no) {
		res = 1;
		for(i = 1; i <= no; i++) {
			res = res * i;
		}
		return res;

	}
}

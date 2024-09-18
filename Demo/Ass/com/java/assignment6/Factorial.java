package com.java.assignment6;

// Design method int factorial(int no)  which returns int value to that method. print the
// results into main method.

public class Factorial {

	public static void main(String[] args) {

		int a = 5;
		int fact = Factorial.fact(a);
		System.out.println("The factorial of " + a + " is : " + fact);

	}

	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {

			// for (int i = num;i>0;i--){
			fact = fact * i;
		}
		return fact;
	}
}

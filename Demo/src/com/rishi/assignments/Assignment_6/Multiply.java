package com.rishi.assignments.Assignment_6;

import java.util.Scanner;

public class Multiply {

	public void multiplication(int num) {
		int res;

		for (int i = 1; i <= 10; i++) {
			res = num * i;
			System.out.println(num+"*"+i+"="+res);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		Multiply m = new Multiply();
		m.multiplication(n);

	}

}

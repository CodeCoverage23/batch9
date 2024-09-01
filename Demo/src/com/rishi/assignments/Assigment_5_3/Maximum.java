package com.rishi.assignments.Assigment_5_3;

import java.util.Scanner;

public class Maximum {

	public void max(int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " is greater");
		} else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " is greater");
		} else {
			System.out.println(n3 + " is greater");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		Maximum m = new Maximum();
		m.max(num1, num2, num3);

	}

}

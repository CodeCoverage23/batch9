package com.rishi.assignments.Assigment_5_8;

import java.util.Scanner;

public class Swap {

	public void swap(int a, int b) {
		int temp;
		System.out.println("Values before swapping : " + a + " " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Values after swapping : " + a + " " + b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for swapping");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		Swap s = new Swap();
		s.swap(n1, n2);
	}

}

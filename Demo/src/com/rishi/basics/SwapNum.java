package com.rishi.basics;

public class SwapNum {

	public static void main(String[] args) {

		// With third variable

		int a = 10;
		int b = 20;
		int temp;
		System.out.println("Values before swapping A :" + a + " B :" + b);

		temp = a;
		a = b;
		b = temp;
		System.out.println("Values after swapping A :" + a + " B :" + b);
		System.out.println();

		// Without third variable with arithmetic operators + & -

		int c = 30;
		int d = 40;
		System.out.println("Values before swapping C :" + c + " D :" + d);

		c = c + d;
		d = c - d;
		c = c - d;
		System.out.println("Values after swapping C :" + c + " D :" + d);
		System.out.println();

		// Without third variable with arithmetic operators + & -

		int e = 50;
		int f = 60;
		System.out.println("Values before swapping E :" + e + " F :" + f);

		e = e * f;
		f = e / f;
		e = e / f;
		System.out.println("Values after swapping E :" + e + " F :" + f);

	}

}

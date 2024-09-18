package com.java.assignment6;

// Design method void multiplication (int no) and print the multiplication table.

public class MultiplicationTable {

	public static void main(String[] args) {
		MultiplicationTable.Multiplication(5);
	}

	public static void Multiplication(int num) {
		System.out.println("The multiplication table for " + num);

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

}

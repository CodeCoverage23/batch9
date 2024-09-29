package com.assignment_14.basics;

/*1.Write a java program to print the all multiplication table from * 2, 3, 4.... to 20.
*/


public class Assignment14_1 {

	public static void main(String[] args) {
	
		for(int i = 2; i <= 20; i++) {
			System.out.println("Multiplication table for" +i);
			for(int j = 1; j <= 10 ; j++) {
				System.out.println(i + " * " + j + " = " +(i * j));
			}
			System.out.println();
		}
		

	}

}

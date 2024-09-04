package com.assignment7;
import java.util.Scanner;

public class Assignment2 {
	
	static int num,res;
	public int getNumberCube(int num) {
		return num * num * num;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Assignment2 assig = new Assignment2();

		System.out.println("Enetr a number: ");
		 num = sc.nextInt();
		sc.close();

		 res = assig.getNumberCube(num);
		System.out.println("The cube of " + num + " is: " + res);


	}

}

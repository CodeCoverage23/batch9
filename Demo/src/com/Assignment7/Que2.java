package com.Assignment7;
//2. Design method public int getNumberCube(int num), return int value to that method and result should be into main method.

import java.util.Scanner;

public class Que2 {
	public static int getNumberCube(int n) {
		return (int) Math.pow(n, 3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number : ");
		int n=sc.nextInt();
		System.out.println("Cube of "+n+" : "+getNumberCube(n));
		

	}

}

package com.Assignment14;
/*
 * 1.Write a java program to print the all multiplication table from * 2, 3, 4.... to 20.
 */
public class PrintTable {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(i*j+"	");
			}
			System.out.println();
		}

	}

}

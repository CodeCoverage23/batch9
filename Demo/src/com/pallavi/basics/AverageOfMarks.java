package com.pallavi.basics;

import java.util.Scanner;

public class AverageOfMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("ENTER COUNT OF NUMBER TO CALCULATEAVG: ");
		int count = sc.nextInt();
		
		
		int array[] = new int [count];
		
		for(int i = 0; i<array.length; i++) {
			System.out.println("Please enter a element: ");
			array[i] = sc.nextInt();
			sum =sum + array[i];
			
			
		}
		
		double avg = sum/count;
		
		System.out.println("the average og the given number are: "+avg);
		sc.close();
	}

}

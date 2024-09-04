package com.java.program;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int sum=0;
		
		System.out.println("enter a count of number to calculate avg>>");
		int count = sc.nextInt();
		
		int array[]= new int[count];
		
		for(int i=0;i<array.length;i++) {
			
			System.out.println("please enter a element>>");
			array[i]= sc.nextInt();
			sum=sum+array[i];
		}
		
		double avg=sum/count;
		
		System.out.println("the avg of the given numbers are : "+avg);
		
		
		
	}

}

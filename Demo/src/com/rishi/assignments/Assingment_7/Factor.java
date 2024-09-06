package com.rishi.assignments.Assingment_7;

import java.util.Scanner;

public class Factor {
	
	public void findFactors(int num) {
		System.out.println("Factors of given number are ");
		
		for(int i =1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		
		Factor f = new Factor();
		f.findFactors(n);
	}

}

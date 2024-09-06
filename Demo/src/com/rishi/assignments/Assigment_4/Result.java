package com.rishi.assignments.Assigment_4;

import java.util.Scanner;

public class Result {

	int total;
	float avg;

	public void calculate(int m1, int m2, int m3, int m4, int m5) {
		total = m1 + m2 + m3 + m4 + m5;
		avg = total / 5;
		System.out.println("Total Marks are = " + total);
		System.out.println("Average is = " + avg);
	}

	public static void main(String[] args) {

		int s1, s2, s3, s4, s5;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of five subjects");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		s4 = sc.nextInt();
		s5 = sc.nextInt();

		Result r = new Result();
		r.calculate(s1, s2, s3, s4, s5);

	}

}

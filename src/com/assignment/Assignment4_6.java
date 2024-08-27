package com.assignment;
import java.util.Scanner;

public class Assignment4_6 {

	static int m1,m2,m3,m4,m5,total,avg;
	
	public int add() {
		total = m1+m2+m3+m4+m5;
		return total;
	}
	
	public int avg() {
		avg =total/5;
		return avg;
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);

		Assignment4_6 a46=new Assignment4_6();
		
		System.out.println("Enter the marks to be calculate");

		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
		
		System.out.println("Addition of total marks :" +(a46.add()));
		
		System.out.println("Average of total marks :" +(a46.avg()));

	}
}

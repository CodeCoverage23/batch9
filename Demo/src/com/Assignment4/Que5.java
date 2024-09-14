package com.Assignment4;

import java.util.Scanner;

//5. Write the Java Program to calculate total of five subject marks and average of it.

public class Que5 {
	public static void totalMarks(int a,int b,int c,int d,int e) {
		int total=a+b+c+d+e;
		System.out.println("Total of five subject marks : "+total);
		int average=total/5;
		System.out.println("Average : "+average);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks for Following subjects : ");
		System.out.println("English : ");
		int english=sc.nextInt();
		System.out.println("Marathi : ");
		int marathi=sc.nextInt();
		System.out.println("Hindi : ");
		int hindi=sc.nextInt();
		System.out.println("Math : ");
		int math=sc.nextInt();
		System.out.println("Science : ");
		int science=sc.nextInt();
		
		totalMarks(english,marathi,hindi,math,science);

	}

}

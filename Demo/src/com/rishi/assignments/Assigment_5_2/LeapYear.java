package com.rishi.assignments.Assigment_5_2;

import java.util.Scanner;

public class LeapYear {

	public boolean isLeap(int y) {
		if((y%4==0)&&(y%100!=0) || (y%400==0)){
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();

		LeapYear l = new LeapYear();

		if (l.isLeap(year)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}

}

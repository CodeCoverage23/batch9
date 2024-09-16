package com.Assignment5;

import java.util.Scanner;

//2.write a program to check whether year is leap year or not. (If else stmt).
public class LeapYear {
	public static boolean checkLeap(int n) {
		if(n%100==0) {
			if(n%400==0) {
				return true;
			}
			else {
				return false;
			}
			
		}
		if(n%4==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(checkLeap(n)) {
			System.out.println(n+" is a leap year ");
		}
		else {
			System.out.println(n+" is not a leap year");
		}

	}

}

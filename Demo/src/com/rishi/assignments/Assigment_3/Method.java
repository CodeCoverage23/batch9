package com.rishi.assignments.Assigment_3;

import java.util.Scanner;

public class Method {

	public void show(String s) {
		System.out.println("Student's name is : " + s);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student's name>>>");
		String str = sc.next();

		Method m = new Method();
		m.show(str);
	}

}

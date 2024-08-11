package com.basic;

/**
 * Static variable demo
 */
public class Student2 {

	int rollNo;
	String name;
	static String clgName = "KBSD";

	public Student2(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public static void main(String[] args) {

		Student2 s1 = new Student2(101, "Kishor");
		Student2 s2 = new Student2(102, "Pavan");
		Student2 s3 = new Student2(103, "Akshay");
		Student2 s4 = new Student2(104, "Abhijeet");
		Student2 s5 = new Student2(105, "Kishor");

		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();

	}

	public void display() {
		System.out.println(rollNo + " " + name + " " + clgName);
	}

}

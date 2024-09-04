package com.kallu.java;

public class Student {

	int rollNo;
	String name;
	String clgName;

	public Student(int rollNo, String name, String clgName) {
		this.rollNo = rollNo;
		this.name = name;
		this.clgName = clgName;
	}

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public Student() {
		
	}

	public static void main(String[] args) {

		Student student = new Student(101, "John", "DTS");
		student.printValue();
		
		new Student();

	}

	public void printValue() {
		System.out.println(rollNo + " " + name + " " + clgName);
	}

}
package com.basic.constructor;

public class Student1 {

	int rollNo;
	String name;
	String clgName;

	public Student1(int rollNo, String name, String clgName) {
		this.rollNo = rollNo;
		this.name = name;
		this.clgName = clgName;
	}

	public Student1(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public Student1() {
		
	}

	public static void main(String[] args) {

		Student1 student1 = new Student1(101, "John", "DTS");
		student1.printValue();
		
		new Student1();

	}

	public void printValue() {
		System.out.println(rollNo + " " + name + " " + clgName);
	}

}

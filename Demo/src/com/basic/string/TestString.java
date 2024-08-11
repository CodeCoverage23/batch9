package com.basic.string;

public class TestString {

	public static void main(String[] args) {

		String s1 = "Code";
		String s2 = "Coverage";

		s1 = s1.concat(s2);

		System.out.println(s1);

		String s3 = "Java";
		System.out.println(s1 + s3);

		System.out.println(20 + 30 + "Program"); // 50Program
		System.out.println("Program" + 20 + 30); // Program50

	}

}

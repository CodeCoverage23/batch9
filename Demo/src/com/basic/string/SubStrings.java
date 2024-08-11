package com.basic.string;

public class SubStrings {

	public static void main(String[] a) {

		String s1 = "Code coverage provides Java Classes";

		String substring = s1.substring(4);
		System.out.println(substring);
		String trim = substring.trim();
		System.out.println(trim);
		System.out.println("Index of J : " + s1.indexOf("J"));

		System.out.println("Substring with Given index : " + s1.substring(23, 27));

		String s2 = "Java is a programming language";

		System.out.println(s2.toUpperCase());

		String s3 = "CODE COVERAGE";
		System.out.println(s3.toLowerCase());

		String s4 = "Java, Python, C, Cpp, Scala";

		String[] split = s4.split(" ");
		System.out.println(split);

		String replace = s3.replace("CODE", "JAVA");
		System.out.println(replace);

		System.out.println("S1 string obj length : " + s1.length());
		System.out.println(s2.length());

		String s5 = "COde";
		String s6 = "code";

		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));

	}

}

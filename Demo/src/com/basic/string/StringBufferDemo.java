package com.basic.string;

public class StringBufferDemo {

	public static void main(String[] args) {

		String s1 = "Code";
		s1.concat("Coverage");
		System.out.println(s1);

		StringBuffer sb = new StringBuffer("Code");
		sb.append(" Coverage");
		System.out.println(sb);

		StringBuilder sb1 = new StringBuilder("Code");
		sb1.append(" Coverage");
		System.out.println(sb1);

	}

}

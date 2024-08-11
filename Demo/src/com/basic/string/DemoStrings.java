package com.basic.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoStrings {

	public static void main(String[] args) {

		DemoStrings demoStrings = new DemoStrings();

		String s1 = "Code";
		String s2 = new String("Code");

		boolean b = s1.equals(s2);
		System.out.println(b); // true

		System.out.println(s1 == s2); // false

		int m1 = demoStrings.m1(4);
		System.out.println(m1);
		
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		Collections.unmodifiableList(l);
		l.add(20);
		System.out.println(l);
		
		
	}
	public int m1(int a) {
		return a*10/4-30;
	}
}

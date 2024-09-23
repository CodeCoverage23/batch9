package com.basic.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set<String> s = new LinkedHashSet<String>();

		s.add("John");
		s.add("Sam");
		s.add("Karan");
		s.add("Karan");
		s.add("Harry");

		System.out.println(s);

	}

}

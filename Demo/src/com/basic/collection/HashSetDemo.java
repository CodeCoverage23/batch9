package com.basic.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<>();

		s.add(45);
		s.add(45);
		s.add(44);
		s.add(5);
		s.add(95);
		s.add(35);
		s.add(25);
		s.add(5);

		System.out.println(s.add(25)); // returns false to avoid duplicates
		System.out.println(s.add(100));

		System.out.println(s);

		HashSet<Integer> h = new HashSet<>();

		h.add(85);
		h.add(91);
		h.add(37);
		h.add(null);
		h.add(null);
		h.addAll(s);

		System.out.println(h);

	}

}

package com.basic.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<Integer> s = new TreeSet<>();

		s.add(100);
		s.add(85);
		s.add(17);
		s.add(-19);
		s.add(20);
		s.add(4);

		System.out.println(s);

		/*
		 * ClassCastException
		 * 
		 * Set set = new TreeSet();
		 * 
		 * set.add(12); 
		 * set.add(12.12);
		 * 
		 * System.out.println(set);
		 */

	}

}

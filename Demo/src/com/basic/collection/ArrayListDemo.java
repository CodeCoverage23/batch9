package com.basic.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(45);
		al.add(4);
		al.add(null);
		al.add(58);

		al.addFirst(22);
		al.add(3, 4);
		al.add(77);
		al.addLast(77);
		System.out.println(al);

		al.remove(4);

		System.out.println(al);

		List<String> l = new ArrayList<>();
		l.add("Code");
		l.add("Code");
		l.add("Coverage");
		l.add("Java");

		System.out.println(l);

		for (String s : l) {
			System.out.println(s.toUpperCase());
		}

	}

}

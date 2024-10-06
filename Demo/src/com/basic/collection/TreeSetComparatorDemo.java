package com.basic.collection;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetComparatorDemo {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<Integer>(new DemoComparator());

		t.add(55);
		t.add(101);
		t.add(45);
		t.add(182);
		t.add(9);
		t.add(41);

		// lambda expression ->
		t.forEach(entry -> System.out.println(entry));

		System.out.println();

		TreeMap<String, String> tm = new TreeMap<>(new SortByKeyDesc());

		tm.put("Java", "Language");
		tm.put("Python", "Language");
		tm.put("HTML", "Language");

		System.out.println(tm);

	}

}

class DemoComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}

}

class SortByKeyDesc implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		return o2.toString().compareTo(o1.toString());
	}

}
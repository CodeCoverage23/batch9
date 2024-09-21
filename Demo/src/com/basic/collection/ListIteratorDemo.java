package com.basic.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("Python");
		list.add("Scala");
		list.add("html");
		list.add(".Net");
		list.add("JavaScript");

//		for (String s : list) {
//			System.out.println(s);
//		}

		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String next = listIterator.next();

			// String upperCase = next.toUpperCase();

			System.out.println(next);
		}

	}

}

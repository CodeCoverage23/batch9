package com.basic.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(45);
		al.add(4);
		al.add(58);

		LinkedList<Integer> l = new LinkedList<>(al);

		l.add(45);
		l.add(55);
		l.add(null);
		l.add(100);
		Integer first = l.getFirst();
		System.out.println(first);

		System.out.println(l);

	}

}

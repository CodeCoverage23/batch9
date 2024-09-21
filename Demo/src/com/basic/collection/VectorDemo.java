package com.basic.collection;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		v.add(100);
		v.add(200);
		v.add(500);
		v.add(900);
		v.add(300);
		v.add(200);

		v.addElement(444);

		System.out.println(v);

		Enumeration<Integer> elements = v.elements();

		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement() + 100);
		}

		System.out.println("--------------------------------------");

		// v.stream().forEach(entry -> System.out.println(entry));

	}

}

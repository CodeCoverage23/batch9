package com.basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		for (int a : arr) {
			System.out.println(a);
		}

		System.out.println(arr);

		int[] a2 = new int[5];
		a2[0] = 1;
		a2[1] = 1;
		a2[2] = 1;
		a2[3] = 1;
		a2[4] = 1;

		List l = new ArrayList<>();

		l.add(1);
		l.add(2);
		l.add(1);
		l.add(1.12);
		l.add("String");

		System.out.println(l);

	}

}

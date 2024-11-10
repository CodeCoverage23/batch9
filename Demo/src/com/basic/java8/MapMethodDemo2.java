package com.basic.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 50; i++) {
			list.add(i);
		}
		System.out.println(list);

		// add 100 in each number
		List<Integer> add = list.stream().map(num -> num + 100).toList();
		System.out.println(add);

		// get the square of even numbers

		List<Integer> l = new ArrayList<Integer>();
		for (Integer i : list) {
			if (i % 2 == 0) {
				int squ = i * i;
				l.add(squ);
			}
		}
		System.out.println(l);

		List<Integer> collect = list.stream().filter(number -> number % 2 == 0).map(number -> number * number)
				.collect(Collectors.toList());
		System.out.println(collect);

		// method reference to replace lambda expression
		list.stream().filter(number -> number % 2 == 0).map(number -> number * number).forEach(System.out::println);

	}

}

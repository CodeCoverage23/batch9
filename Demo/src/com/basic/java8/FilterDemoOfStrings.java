package com.basic.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemoOfStrings {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Java", "Python", "Scala", "Ruby", "cpp", "golang", "kotline", "pascle");

		// Traditional way
		List<String> l = new ArrayList<>();
		for (String s : list) {
			if (s.length() >= 5) {
				l.add(s);
			}
		}
		System.out.println(l);

		// filter method

		List<String> stringWith5Chars = list.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());
		System.out.println(stringWith5Chars);

		list.stream().filter(s -> s.length() >= 5).collect(Collectors.toList()).forEach(e -> System.out.println(e));

		// to avoid null pointer exception
		List<String> list2 = Arrays.asList("JavaScript", "html", "css", null, "bootstrap");

		List<String> list3 = list2.stream().filter(e -> e != null && e.length() <= 5).toList();

		System.out.println(list3);

	}

}

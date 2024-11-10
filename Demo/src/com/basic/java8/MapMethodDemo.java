package com.basic.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapMethodDemo {

	private static final String CHAR_A = "A";

	public static void main(String[] args) {

		List<String> cityNames = Arrays.asList("Akola", "Pune", "Amravati", "Mumbai", "Nagpur", "Nashik", "Dhule",
				"Akot");

		// get the length of strings
		for (String str : cityNames) {
			System.out.println(str.toUpperCase() + " length = " + str.length());
		}

		List<String> list = cityNames.stream().map(city -> city.toUpperCase()).toList();
		System.out.println(list);

		// converts string to upper case if start with A

		List<String> l = new ArrayList<String>();
		for (String str : cityNames) {
			// str.charAt(0) == 'A'
			if (str.startsWith(CHAR_A)) {
				l.add(str.toUpperCase());
			}

		}
		System.out.println(l);

		// with lambda expression

		cityNames.stream().filter(city -> city.startsWith(CHAR_A)).map(city -> city.toUpperCase()).toList()
				.forEach(city -> System.out.println(city));

		// count the cities starts with N

		long count = cityNames.stream().filter(city -> city.charAt(0) == 'N').count();
		System.out.println("Count of Cities start with N = " + count);

	}

}

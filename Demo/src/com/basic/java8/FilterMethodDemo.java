package com.basic.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMethodDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(45, 2, 1, 4, 5, 6, 36, 78, 96, 65, 52, 52, 58, 56, 56, 32, 36, 41, 14, 78, 1,
				2, 7, 6);
		System.out.println(list.size());

		// Traditional way

		List<Integer> evenList1 = new ArrayList<Integer>();
		for (Integer i : list) {
			if (i % 2 == 0) {
				evenList1.add(i);
			}
		}
		System.out.println(evenList1);

		// Filter method - 1st way

		List<Integer> eventList2 = list.stream().filter(entry -> entry % 2 == 0).collect(Collectors.toList());
		System.out.println("Filter by stream API : " + eventList2);

		// Filter method - 2st way
		list.stream().filter(entry -> entry % 2 == 0).collect(Collectors.toList())
				.forEach(entry -> System.out.println(entry));

		// Filter method - 3st way
		list.stream().filter(entry -> entry % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

		// Remove duplicates - 1st way

		Set<Integer> collect = list.stream().collect(Collectors.toSet());
		System.out.println(collect);

		// Remove duplicates - 2st way
		List<Integer> collect2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2);

	}

}

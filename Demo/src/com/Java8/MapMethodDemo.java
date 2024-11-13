package com.Java8;

import java.util.Arrays;
import java.util.List;

public class MapMethodDemo {

	public static void main(String[] args) {
		List<String> cityNames= Arrays.asList("Akola","Pune","Amravati","Mumbai","Nagpur","Nashik","Dhule","Wardha");
	
		List<String> list = cityNames.stream().map(city -> city.toUpperCase()).toList();
		System.out.println(list);
		
		System.out.println("***************************************");
		// convert string to uppercase if starts with A
		
		cityNames.stream().filter(e->e.startsWith("A")).map(city ->city.toUpperCase()).forEach(System.out::println);
	
		long count = cityNames.stream().filter(e -> e.startsWith("N")).count();
		System.out.println("Count of cities starts with N : "+ count);
	}

}

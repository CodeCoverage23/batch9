package com.basic.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

		// Predicate interface predict the result

		Predicate<Integer> p = t -> t == 150;
		boolean test = p.test(450);
		System.out.println(test);
		System.out.println(p.test(150));

		Predicate<String> p2 = t -> t.contains("J");
		boolean test2 = p2.test("Code");
		System.out.println(test2);
		System.out.println(p2.test("Java"));
		
		Function f;

	}

}

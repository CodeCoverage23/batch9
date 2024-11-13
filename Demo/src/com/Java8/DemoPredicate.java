package com.Java8;

import java.util.function.Predicate;

public class DemoPredicate {

	public static void main(String[] args) {
		Predicate<Integer> p = e -> e > 2;

		System.out.println(p.test(3));

	}

}

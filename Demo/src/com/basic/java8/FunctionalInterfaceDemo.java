package com.basic.java8;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo implements Function<Float, String> {

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

		// Function interface apply the change and return the result

		Function<Integer, String> f1 = i -> i * i + " it is a square of : " + i;
		String square = f1.apply(1356);
		System.out.println(square);

		Function<Integer, Integer> f2 = v -> v * v;
		System.out.println(f2.apply(7));

		Function<String, String> f3 = s -> s.toUpperCase().concat(" is an institute.");
		String string = f3.apply("code coverage");
		System.out.println(string);
		System.out.println(f3.apply("code one"));

		// Traditional way

		FunctionalInterfaceDemo n = new FunctionalInterfaceDemo();
		String value = n.apply(12.2f);
		System.out.println(value);

		Function<Float, String> f4 = t -> t.toString().concat(" It is a float value. (Lambda Expression)");
		System.out.println(f4.apply(12.2f));

		// Supplier supplies the data

		Supplier<Double> s1 = () -> Math.random();
		System.out.println(s1.get());
		Double double1 = s1.get();
		System.out.println(double1);

		Supplier<String> s2 = () -> UUID.randomUUID().toString();
		System.out.println(s2.get());

		// Consumer accept the data

		Consumer<String> c1 = c -> System.out.println(c);
		c1.accept("Java is a programming language");

		Consumer<Long> c2 = c -> {
			Long l = 1000 + c;
			System.out.println(l);
		};

		c2.accept(111L);

	}

	@Override
	public String apply(Float t) {
		return t.toString().concat(" It is a float value.");
	}

}

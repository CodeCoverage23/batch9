package com.Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoFunction {

	public static void main(String[] args) {

		Function<Integer, String> f = i -> i * i + "-> it is square of : " + i;
		String square = f.apply(13);
		System.out.println(square);

		Function<Integer, String> f2 = v -> v * v + "-> it is square of : " + v;
		System.out.println(f2.apply(7));

		Function<String, String> f3 = s -> s.toLowerCase().concat("COde COverAGE");
		String str = f3.apply("Institute : ");
		System.out.println(str);

		Function<Float, String> f4 = entry -> entry.toString().concat(" it is a float value. ");
		System.out.println(f4.apply(2.5f));

		// Supplier supplies the data

		Supplier<Double> s1 = () -> Math.random();
		System.out.println(s1.get());
		Double s2 = s1.get();
		System.out.println(s2);

		// consumer accept the data

		Consumer<String> c1 = c -> System.out.println(c);
		c1.accept("Java is a programming language");

		Consumer<Long> c2 = c -> {
			Long l = 1000 + c;
			System.out.println(l);
		};
		
		c2.accept(122L);

	}

}

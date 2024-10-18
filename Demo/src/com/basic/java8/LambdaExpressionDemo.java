package com.basic.java8;

interface Test {

	public void display();

}

interface Add {

	public void add(int a, int b);
}

interface Square {

	public int mul(int a);

}

public class LambdaExpressionDemo {

	public static void main(String[] args) {

		Test t = () -> System.out.println("Hello Java");
		t.display();

		Add add = (a, b) -> System.out.println(a + b);
		add.add(11, 22);

		Square s = a -> a * a;
		int square = s.mul(12);
		System.out.println(square);

	}

}

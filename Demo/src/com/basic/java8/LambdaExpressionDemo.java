package com.basic.java8;

interface Test {

	public void display();

}

public class LambdaExpressionDemo {

	public static void main(String[] args) {

		Test t = () -> System.out.println("Hello Java");
		t.display();

	}

}

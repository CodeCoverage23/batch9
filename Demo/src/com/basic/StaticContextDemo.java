package com.basic;

public class StaticContextDemo {

	static int data = 10;

	public static void print() {
		System.out.println(data);
	}

	static class InnerClass {
		// demo
	}

	static {
		System.out.println("I am static block");
	}

	public static void main(String[] args) {

		StaticContextDemo.print();
		StaticContextDemo s = new StaticContextDemo();
		s.method();

	}

	public void method() {
		System.out.println("I will get called with object");
	}
}

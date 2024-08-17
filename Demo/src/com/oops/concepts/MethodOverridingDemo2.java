package com.oops.concepts;

class Addition {

	public int add(int a, int b) {
		return a + b;
	}
}

public class MethodOverridingDemo2 extends Addition {

	public static void main(String[] args) {

		MethodOverridingDemo2 demo = new MethodOverridingDemo2();

		System.out.println(demo.add(44, 88));
	}

	@Override
	public int add(int a, int b) {
		return a * b;
	}

}

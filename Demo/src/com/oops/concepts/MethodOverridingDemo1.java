package com.oops.concepts;

class Parent {

	public void marry() {
		System.out.println("Marry to LAXMI");
	}

}

public class MethodOverridingDemo1 extends Parent {

	public static void main(String[] args) {

		MethodOverridingDemo1 demo = new MethodOverridingDemo1();
		demo.marry();

	}

	@Override
	public void marry() {
		System.out.println("Marry to Aliya");
	}

}

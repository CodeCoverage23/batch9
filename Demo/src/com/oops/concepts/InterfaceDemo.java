package com.oops.concepts;

public class InterfaceDemo implements Inter {

	@Override
	public void m1() {

		System.out.println("M1 method from Inter interface");
	}

	@Override
	public void m2() {
		System.out.println("M2 method from Inter interface");

	}

	public static void main(String[] args) {

		InterfaceDemo i = new InterfaceDemo();

		i.m1();
		i.m2();

	}
}

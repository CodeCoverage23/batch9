package com.oops.concepts;

abstract class Test3 {

	public void m1() {
		System.out.println("Method m1");
	}

	abstract public void m2();

	final public void m3() {
		System.out.println("Final method from abstract class");
	}

	abstract public void m4();

}

public class AbstractDemo extends Test3 {

	@Override
	public void m2() {
		System.out.println("Abstract method from Test 3 class");

	}

	public static void main(String[] args) {
		AbstractDemo d = new AbstractDemo();

		d.m2();
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

}

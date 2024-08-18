package com.oops.concepts;

/*
 * This is a final class so we can not inherit this class
 */
final class FinalClass {

	public void finalClassMethod() {
		System.out.println("I am final class method");
	}

}

class NonFinalClass {

	public final void finalMethod() {
		System.out.println("I am final method");
	}

	public void nonFinalMethod() {
		System.out.println("Non final method");
	}

}

public class FinalKeywordDemo extends NonFinalClass {

	static int data = 10;

	final static float piValue = 3.14f;

	final static int b = 100;

	public static void main(String[] args) {

		data = 12;
		System.out.println(data);

		// final variable value will not be change
		// piValue = 3.5f;

		float c = b + piValue;

		// b = b + 100;

		System.out.println(piValue);

	}

	/*
	 * we can not override final method
	 * 
	 * @Override public final void finalMethod() {
	 * 
	 * }
	 */

	@Override
	public void nonFinalMethod() {
		System.out.println("We can happly override non final method");
	}

}

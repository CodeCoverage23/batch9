package com.oops.concepts;

public class ConstructorCall {

	int value;

	public ConstructorCall() {
		this(10);
		System.out.println("default con");
	}

	public ConstructorCall(int value) {
		this.value = value;
		System.out.println(this.value);
	}

	public static void main(String[] args) {
		new ConstructorCall();
	}
}

package com.basic.constructor;

public class ParaConstructor {

	int a;

	public ParaConstructor(int b) {
		a = b;
	}

	public static void main(String[] args) {

		ParaConstructor paraConstructor = new ParaConstructor(10);

		System.out.println(paraConstructor.a);

	}

}
package com.basic.java8;

@FunctionalInterface
public interface Inter {

	void add(int a, int b);

	default void sub(int a, int b) {
		//
	}

}

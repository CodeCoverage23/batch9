package com.basic.java8;

public interface Car {

	void fual();

	// void charge();

	default void charge() {
		System.out.println("Percentage");
	}

	public static String status() {
		return "OK";

	}

}

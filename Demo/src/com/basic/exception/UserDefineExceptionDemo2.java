package com.basic.exception;

class YoungException extends RuntimeException {

	YoungException(String msg) {
		super(msg);
	}
}

class OldException extends RuntimeException {

	OldException(String msg) {
		super(msg);
	}
}

public class UserDefineExceptionDemo2 {

	public static void main(String[] args) {

		int age = 22;

		if (age < 18) {
			throw new YoungException("Young exception");
		} else if (age > 60) {
			throw new OldException("Old exception");
		} else {
			System.out.println("Welcome to application, you will get marry soon...");
		}

	}

}

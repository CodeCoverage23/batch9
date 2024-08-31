package com.basic.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {

//		int data = 10;
//		int c = data / 0; // Arithmetic exception
//		System.out.println(c);

//		String s = null;
//		s.length(); // Null Pointer exception
//		System.out.println(s);

//		String s = "1A3456";
//		int i = Integer.parseInt(s); // Number format exception
//		System.out.println(i);

//		String s = "CC";
//		for (int i = 0; i <= s.length(); i++) {
//			System.out.println(s.charAt(i));  // StringIndexOutOfBoundsException
//		}

		FileReader f = new FileReader("c\\user\\Test.txt");

	}

}

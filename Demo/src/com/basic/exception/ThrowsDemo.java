package com.basic.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader f = new FileReader("c://user//demo//text.txt");

		String encoding = f.getEncoding();
		System.out.println(encoding);
		
		try {
			method();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public static void method() throws ClassNotFoundException {
		
		throw new ClassNotFoundException();
		
	}

}

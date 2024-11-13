package com.Java8;

interface Messageable{
	Message getMessage(String string);
}

class Message{
	
	Message(String msg){
		System.out.println(msg);
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		Messageable obj = Message :: new;
		obj.getMessage("hello");

	}

}

package com.Java8;

public interface Car {
	void fuel();
	
	//void ev();
	
	default void charge() {
		System.out.println("Percentage");
	}
	
	public static  String status(){
		return null;
		
	}

}

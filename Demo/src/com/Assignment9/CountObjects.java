package com.Assignment9;

public class CountObjects {
	
	static int count=0;
	
	public CountObjects() {
		count++;
	}
	public static int getObjectCount() {
		return count;
	}

	public static void main(String[] args) {
		CountObjects a1=new CountObjects();
		CountObjects a2=new CountObjects();
		CountObjects a3=new CountObjects();
		CountObjects a4=new CountObjects();
		CountObjects a5=new CountObjects();
		System.out.println("Objects Created until now : "+getObjectCount());
		CountObjects j=new CountObjects();
		CountObjects i=new CountObjects();
		CountObjects y=new CountObjects();
		CountObjects a=new CountObjects();
		System.out.println("Objects Created until now : "+getObjectCount());
	}

}

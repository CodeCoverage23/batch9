package com.java.program;

public class MainStudent {

	 public static void main(String[] args) {
		Student st=new Student();
		st.setCity("amravati");
		st.setCountry("india");
		
		System.out.println(st.getCity());
		
		System.out.println(st);
		Student obj =new Student("abc","xyz","amt","india","274947499");
		System.out.println(obj);
		
		
		
		

	}

}

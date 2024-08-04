package com.rishi.constructor;

public class ParameterizedConst {
	
	int rollNo;
	String name;
	String branch;
	
	public ParameterizedConst(int rollNo, String name, String branch) {
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
	}
	
	public void display() {
		System.out.println(rollNo+" "+name+" "+branch);
	}
	
	public static void main(String[] args) {
		ParameterizedConst c = new ParameterizedConst(01,"Ayush","GPA");
		ParameterizedConst c2 = new ParameterizedConst(02,"Ansh","GPM");
		ParameterizedConst c3= new ParameterizedConst(03,"Krishna","GPW");
		ParameterizedConst c4 = new ParameterizedConst(04,"Niket","GPW");
		ParameterizedConst c5 = new ParameterizedConst(05,"Ankit","GPK");
		
		c.display();
		c2.display();
		c3.display();
		c4.display();
		c5.display();
		
		
	}
	
	

}

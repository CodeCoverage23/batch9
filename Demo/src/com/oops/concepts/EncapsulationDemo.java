package com.oops.concepts;

class Students {

	private int rollNo = 10;
	private String name;
	private String clgName;

//	public void display() {
//		System.out.println(rollNo);
//	}

	public int getRollNo() {
		return this.rollNo;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

}

public class EncapsulationDemo {

	public static void main(String[] args) {

		Students s = new Students();
		// s.display();

		s.setClgName("KBD");
		String clgName = s.getClgName();

		System.out.println(clgName);
		
	}

}

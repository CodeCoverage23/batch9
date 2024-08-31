package com.pallavi.basics;

 class Students{
	 private int rollNo = 5;
	 private String name;
	 private String clgName;
 
 
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
  
 public class Encapsulation {
	public static void main(String[] args) {
		
		Students s = new Students();
		
		s.setClgName("KBD");
		String clgName = s.getClgName();
		
		System.out.println(clgName);
		
	}
	

}

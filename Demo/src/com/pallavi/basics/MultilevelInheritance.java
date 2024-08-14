package com.pallavi.basics;

class A{
	public void add() {
		System.out.println("It will add the number: ");
	}
}
class B extends A{
	public void sub() {
		System.out.println("It will subtract the number:");
	}
}
class C extends B{
	public void mul() {
		System.out.println("It will multiply the number:");
	}
}
class D extends C{
	public void div() {
		System.out.println("It will devided the number:");
	}
}
 public class MultilevelInheritance extends D{
	public static void main(String args[]) {
		MultilevelInheritance m =new MultilevelInheritance();
		m.add();
		m.sub();
		m.mul();
		m.div();
		
	}
 }

	


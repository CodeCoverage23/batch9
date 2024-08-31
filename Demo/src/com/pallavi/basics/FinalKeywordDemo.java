package com.pallavi.basics;
/*
 * This is final class we can not inherit this class
 */

final class FinalClass{
	
	
	public void finalClassMethod() {
		System.out.println("I am final class method");
	}
}


   class NonFinalClass{
	   
	   public final void finalMethod()
	   {
		   System.out.println("I am final method");
	   }
	   
	   public void nonFinalMethod(){
		
		   System.out.println("Non final method");
		   
	   }
   }
public class FinalKeywordDemo extends NonFinalClass {
	
	/*
	 * @override public final void finalMethod
	 */

	
	static int data = 10;
   final  static float piValue = 3.14f;
	public static void main(String[] args) {
		
		
		data = 12;
		System.out.println(data);
		// Final variable value can not be change
		//piValue = 3.5f;
		System.out.println(piValue);
		
	}
	
	public void nonFinalMethod() {
		System.out.println("We can apply override non final keyword");
	}

}

package tests;

public class Test2 {
	
	public static void red() {
		System.out.println("red");
	}
	
	public void blue() {
		System.out.println("blue");
	}
	
	//method name same as the ClassName
	//No return type
	//No need to call Constructor, Constructor will be called automatically when object is created for the class
	public Test2() {
		System.out.println("I'm in Constructor");		
	}

}

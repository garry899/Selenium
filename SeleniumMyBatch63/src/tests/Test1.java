package tests;

import selenium.Test4;

public class Test1 {
	
	//ClassName objName = new ClassName();
	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();
	
	public static void main(String[] args) {
		
		System.out.println("I'm in main method");
		Test1.scanMe();
		printMe();
		System.out.println("After PrintMe");
		t1.testMe();
		t1.useMe();
		Test2.red();
		t2.blue();
		Test3.circle();
		t3.square();
		Test4.audi();
		t4.bmw();
		ArgumentsTest.sum(100, 200); //100+200

	}
	
	public static  void printMe() {
		System.out.println("PrintMe");
	}
	
	public static void scanMe() {
		System.out.println("scanMe");
	}
	
	public void testMe() {
		System.out.println("testMe");
	}
	
	public void useMe() {
		System.out.println("useMe");
	}

}

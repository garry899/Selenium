package tests;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//ClassName objName = new ClassName();
		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("Selenium");
		tools.add("Java");
		tools.add("Junit");
		tools.add("TestNG");
		
		System.out.println(tools.size()); //4
		
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		
		System.out.println("----------------------------------------");
		
		for(int i=0; i<tools.size(); i++) {
			System.out.println(tools.get(i));
		}
		
		tools.add("TestLink");
		System.out.println(tools.size()); //5
		
		tools.remove(2);
		System.out.println(tools.size()); //4
		System.out.println(tools.get(2));  //TestNG
	}

}

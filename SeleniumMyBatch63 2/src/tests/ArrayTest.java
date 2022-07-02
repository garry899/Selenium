package tests;

public class ArrayTest {

	public static void main(String[] args) {
		
		String tool = "Selenium";
		System.out.println(tool);
		System.out.println("---------------------------------------");
		
		//String Array
		String tools[] = {"Selenium", "Junit", "Testlink", "TesRail", "Jira"};
		System.out.println(tools.length);
		
		System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println(tools[4]);
		
		System.out.println("---------------------------------");
		
		for(int i=0; i<tools.length; i++) {
			System.out.println(tools[i]);
		}
		
		//int Array
		System.out.println("------------------------------------");
		int nikul[] = {1,5,77, 102,1004};
		System.out.println(nikul.length);
		
		for(int i=0; i<nikul.length;i++) {
			System.out.println(nikul[i]);
		}
		
		
		//object array
		System.out.println("---------------------------------------");
		Object mix[] = {10, "Hello", 35, "Java"};
		System.out.println(mix.length);
		
		for(int i=0; i<mix.length; i++) {
			System.out.println(mix[i]);
		}
		
		

	}

}

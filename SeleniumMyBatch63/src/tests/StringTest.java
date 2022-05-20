package tests;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String automation = "Selenium";
		System.out.println(automation);
		
		String program = "Java";
		System.out.println(program);
		
		String space = " ";
		
		System.out.println(automation + program);
		System.out.println(automation+ " "+program);
		System.out.println(automation+space+program);
		
		int a = 20;
		int b = 30;
		
		System.out.println(automation+program+a+b);
		System.out.println(a+b+automation+program);
		System.out.println(automation+program+(a+b));
	}

}

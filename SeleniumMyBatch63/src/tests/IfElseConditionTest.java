package tests;

public class IfElseConditionTest {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		if(a==b) {
			System.out.println("a and b are equal");
		}else {
			System.out.println("a and b are not equal");
		}
		
		String expected = "Selenium";
		String actual = "Selenium";
		
		if(expected.equals(actual)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}

	}

}

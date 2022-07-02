package tests;

public class ArgumentsTest {

	public static void main(String[] args) {
		
		sum(); //4+5
		sum(6, 7); //6+7
		sum(45, 55);
		sum(1,2,3);

	}

	public static void sum() {
		int a = 4+5;
		System.out.println(a);
	}
	
	public static void sum(int b, int c) {
		int a = b+c;
		System.out.println(a);
	}
	
	public static void sum(int p, int q, int r) {
		int a = p+q+r;
		System.out.println(a);
	}
	
	
}

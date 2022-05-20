package tests;

public class ReturnTypeTest {

	public static void main(String[] args) {
		
		int x = sum(6, 7);
		System.out.println(x);
		System.out.println(sum(6,7));
		
		String y = hello();
		System.out.println(y);

	}
	
	public static int sum(int b, int c) {
		int a = b+c;
		return a;
	}
	
	public static String hello() {
		String s = "Hello Java";
		return s;		
	}

}

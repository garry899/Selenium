package tests;

public class WhileLoopTest {

	public static void main(String[] args) {
		
		
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			if(i==5) {
				System.out.println("got 5");
				break;
			}
			i++;
		}
		
		System.out.println("After the loop");

	}

}

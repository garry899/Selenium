package tests;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int
		int i = 10;
		System.out.println(i);
		i = 20;
		System.out.println(i);
		i=i+10;
		System.out.println(i);
		i=i*2;
		System.out.println(i); //60
		System.out.println(i*2);
		System.out.println(i);
		
		System.out.println(++i); //Post Increment (i++) - PreIncrement (++i)  = i=i+1;
		System.out.println(i); //61
		
		//double
		double d = 10.4;
		System.out.println(d);
		System.out.println(d*2);
		
		//char
		char c = 'd';
		System.out.println(c);
		c = '8';
		System.out.println(c);
		
		//boolean
		boolean b = true;
		System.out.println(b);
		
		b = false;
		System.out.println(b);
	}

}

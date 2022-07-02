package selenium;

import java.util.Arrays;

import java.util.Comparator;

class arr{
	String value;
	int position;
	int length;
	
	arr(String v,int p,int l){
		value = v;
		position = p;
		length = l;
	}
}

public class arrayTest {

	public static void main(String[] args) {

		arr[] test = {new arr("test",4,5),new arr("You",1,3),new arr("the",3,3),new arr("passed",2,6)};
			
			
			final Comparator<arr> arrayComparator = new Comparator<arr>() {
			 
			 @Override public int compare(arr o1, arr o2) { 

				 return o1.position-o2.position;
			 } 
			 };
			 
			 
			 int sum = 0;
			 Arrays.sort(test, arrayComparator);
		    for (final arr ar : test) {
		    	
		    	sum +=ar.length;
	        System.out.print(ar.value+" ");
	    }
		    System.out.println();
	        System.out.println(sum);
	    }
		

	}

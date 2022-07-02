package selenium;

import java.util.ArrayList;

public class arrayPrinting {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrlist=new ArrayList<Integer>();//1
		
		for(int i=0;i<100;i++)
		{
			arrlist.add(i);// arrlist[0][1][2][3]
			
		}
		
		
		int size=arrlist.size();
		
		for(int i=0;i<size;i++)
		{
			if(arrlist.get(i)%3==0 || arrlist.get(i)%5==0)
			{
				
				if(arrlist.get(i)%3==0 && arrlist.get(i)%5==0)
				{
					System.out.println(arrlist.get(i)+ " number divisible by both 3 and 5");	
				}
				else if(arrlist.get(i)%3==0)
				{
					System.out.println(arrlist.get(i)+ " number is  divisible by 3");
				}
				else
				{
					System.out.println(arrlist.get(i)+ " number is  divisible by 5");	
				}
			}
			
					
		else
		{
			System.out.println(arrlist.get(i)+ " number is neither divisible by 3 nor 5");
		}
		
		
		
	}

}
	}
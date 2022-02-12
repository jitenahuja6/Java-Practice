//Filter element form 1 to 100 in between range(multiple by 5 and 9)

package com.rough.practice;

public class Filtering {
	public static void main(String[] args) {
		for(int i =1; i<=100; i++)
		{
			if(i%5==0 && i%9==0)
			{
				System.out.println(i);
			}
		}
	}

}

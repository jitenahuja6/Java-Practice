package com.pract.java;

public class GCD {
	public static void main(String[] args) {
		int x =30, y =25;
		int gcd =1;
		for(int i =1; i<=x && i<=y; i++)
		{
			if (x % i ==0 && y%i==0)
			{
				gcd =i;
			}}
			System.out.println("gcd is" +gcd);
		
	}

}

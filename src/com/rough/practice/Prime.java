package com.rough.practice;

public class Prime 
{

	public static void main(String[] args) {
		boolean flag = false;
		int n=18;
		for (int i =2; i<=n/2; i++)
		{
			if(n%i==0)
			{
			flag = true;
			break;
			}
			
		}
		if(flag == false)
		{
			System.out.println(+n + " is a prime no");
		}
		else
		{
			System.out.println(+n + " is not a prime no");
		}
		
		}
	}

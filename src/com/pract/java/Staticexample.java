package com.pract.java;

public class Staticexample {
	static int add(int a , int b)
	{
		return a + b;
	}
	static int add(int a , int b, int c)
	{
		return a + b + c;
	}
	
	public static void main(String[] args) {
	int k =	Staticexample.add(23, 25);
	int j =	Staticexample.add(21, 22, 28);
	System.out.println("The value is " +k + " " +j);
	}

}

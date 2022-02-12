package com.java.singleton;

public class Singletontest {

	
	public static void main(String[]args)
	{
		
		
		Abc obj = Abc.getInstance();
		Abc obj1 = Abc.getInstance();
		System.out.println(obj1.hashCode());
		System.out.println(obj.hashCode());
	}
	

}

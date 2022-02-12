package com.java.singleton;

public class Abc {
	
	//In singleton we have to declare reference as static,static we are declaring as we want only one reference to be there for Abc
	static Abc obj = new Abc();
	//For satisfying singleton property we have declare 
	//Constructor we are declaring private as it cant be accessed from outside the  class.If a new instance is created outside the class it will be not be called as it is private.
	private Abc()
	{
		
	}
	
	// Declaring method getInstance which is static as it will return the object.
	public static Abc getInstance()
	 {
		 return obj;
	 }
}

package com.java.practise;

import java.util.function.Supplier;

public class SupplierDemoLambda 
{
	public static void main(String[]args)
	{
		//Supplier is an interface.
		Supplier<String> obj = () ->
		{
			return "supplier with lambda";
		};
	//supplier is having only method i.e get so with using get we are calling Supplier reference.
		System.out.println(obj.get());
	}
	
	
	
	

}

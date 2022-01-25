package com.java.practise;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[]args)
	{
		Predicate<Integer> obj = i ->(i>27);
		System.out.println(obj.test(29));
				
	}

}

package com.java.practise;

import java.util.function.Consumer;

public class ConsumerDemo 
{

	public static void main(String[] args) {
		
		//Consumer is functional interface which as a generic now accepting Integer.
		Consumer<Integer> consumer =a-> System.out.println("Printing " + a);
		
		//Consumer have a default method called accept and in these case it is accepting 10 as input.
		consumer.accept(10);
	}
}
	
	

	

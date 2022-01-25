package com.java.practise;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo1 {
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		list1.stream().forEach(t -> System.out.println("print :" +t));
	}

}

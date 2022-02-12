//Java8 even or odd.

package com.rough.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8even {
	
	public static void main(String[] args) {
		
		List<Integer> obj = Arrays.asList(1, 2,3,4,5,6,7,8,9,10);
		List<Integer> obj1 = obj.stream().filter(i -> i % 2 ==0).collect(Collectors.toList());
		System.out.println(obj1);
		
	}}
		
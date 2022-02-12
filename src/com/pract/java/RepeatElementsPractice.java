package com.pract.java;

import java.util.HashMap;
import java.util.Map;

public class RepeatElementsPractice {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 2, 5, 2, 1 };
		int n = a.length;
		HashMap<Integer, Integer> obj = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (obj.containsKey(a[i])) {
				int c = obj.get(a[i]);
				obj.replace(a[i], c + 1);
			} else {
				obj.put(a[i], 1);
				
			}}
			for(Map.Entry<Integer, Integer> j : obj.entrySet())
			{
				if(j.getValue()>1)
				{
					System.out.println(j.getKey() + " " +j.getValue());
				}
				
			}
		}

	}



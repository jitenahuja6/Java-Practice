//Debug to understand better, Here we are using hashmap concept, array concept and hashmpap put and get concept with it.

package com.pract.java;

import java.util.HashMap;
import java.util.Map;

public class RepeatableElements {
	
	  public static void main(String[] args)
	    {
	  
	        int[] a = { 1, 6, 4, 6, 4, 8, 2, 4, 1, 1 };
	        int n = a.length; // size of array
	  
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < n; i++) {
	  
	            if (map.containsKey(a[i])) {
	  
	                // if element is already in map
	                // then increase the value of element at
	                // index by 1
	  
	                int c = map.get(a[i]);
	                map.replace(a[i], c + 1);
	            }
	  
	            // if element is not in map than assign it by 1.
	            else
	                map.put(a[i], 1);
	        }
	        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
	  
	            // print only if count of element is greater
	            // than 1.
	            if (i.getValue() > 1)
	                System.out.println(i.getKey() + " "
	                                   + i.getValue());
	  
	            
	        }
	    }
	}



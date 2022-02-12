//Here both way we have mentioned for sorting in ascending as well as descending order.
package com.pract.java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(5);
		obj.add(4);
		System.out.println("Before sorting" +obj);
	//These downline will sort in ascending order, 
		//	Collections.sort(obj);  
	//These down line will sort in descending order.
		Collections.sort(obj, Collections.reverseOrder());
		System.out.println("After sorting" +obj);
	}

}

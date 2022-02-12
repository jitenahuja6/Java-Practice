package com.pract.java;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pallindrome {
	public static void main(String[] args) {
		
		int k; 
		String original, reverse = " ";
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		 k = original.length()-1;
		for(int i =k ; i>=0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		
		System.out.println("Reverse of name is" +reverse);
		
	}
}
	
		
	
	
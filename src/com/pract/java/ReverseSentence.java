package com.pract.java;

import java.util.Scanner;

public class ReverseSentence {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		//int n = k.length();
		String  reverse = " ";
		
		String words[] = original.split("\\s");
		for(int i = words.length - 1; i>=0; i--)
		{
			//reverse = reverse + k.charAt(i);
			reverse = reverse +" " +  words[i];
			
			
		}
		System.out.println("Reverse of sentence is " +reverse);
		
		
		
	}

}

//Example of enum, basically it is used for traversing.

package com.java.practise;

public class EnumExample1 {
	
	public enum Season { WINTER, SPRING, SUMMER, FALL, MONSOON }  
	//main method  
	public static void main(String[] args) {  
	//traversing the enum  
	for (Season s : Season.values())  
	System.out.println(s);  
	}}  



package com.exception.practice;

public class PrintStackTraceMethod {
	
	public static void main(String[] args) {
	      try {
	         int a[]= new int[5];
	         a[5]=20;
	      } catch (Exception e) {
	    	  
	    	  System.out.println(e.getMessage());
	       //  e.printStackTrace();
	      }
	   }
	}



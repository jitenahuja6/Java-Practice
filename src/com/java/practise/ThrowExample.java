//Example of throw.

package com.java.practise;

public class ThrowExample {
	
	public static void checkNum(int num) {  
        if (num < 1) {  
           //In throw we are are declaring exception, here we can declare null pointer exception as well, means what we declare that will be thrown and displayed in o/p.
        	throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
        }  
        else {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }  
    }  
    //main method  
    public static void main(String[] args) {  
    	ThrowExample obj = new ThrowExample();  
            obj.checkNum(-3);  
            System.out.println("Rest of the code..");  
    }  
}  
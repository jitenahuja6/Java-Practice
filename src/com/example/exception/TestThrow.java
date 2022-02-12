package com.example.exception;

public class TestThrow{
public static void checkNum(int num) {  
    if (num < 1) {  
        throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
    }  
    else {  
        System.out.println("Square of " + num + " is " + (num*num));  
    }  
}  
//main method  
public static void main(String[] args) {  
        TestThrow obj = new TestThrow();  
        obj.checkNum(9);  
        System.out.println("Rest of the code..");  
}  
}  
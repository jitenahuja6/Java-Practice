//Example of unchecked exception.

package com.java.practise;

public class UncheckedException {
public static void main(String args[]) {
    int x = 0;
    int y = 10;
    int z = y/x; //It is Arithmetic Exception , it is not checked at compile time, it will be checked at runtime only.
}
}
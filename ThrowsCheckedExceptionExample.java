//Example of throws in java.
//Checked exception are checked at compile time, to handle the exception we will use either try catch block or throws exception. In these we have used throws exception to handle the program.
//These u can consider an example of servialization also as we are 
package com.java.practise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsCheckedExceptionExample {
	
	//Here we are trying to fetch data from file i.e in a location from our system, so by default it will throw I/O exception.
	public static void main(String[] args) throws IOException {
       //Here comes an concept of serialization where we are converting an state of an object into byte stream.
		FileReader file = new FileReader("E:\\All Notepad and wordpad\\Rough.txt");
        BufferedReader fileInput = new BufferedReader(file);
          
        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++) 
            System.out.println(fileInput.readLine());
          
        //fileInput.close();
    }
}



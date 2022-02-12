//Example of immutable class

package com.java.immutableclass;

import java.util.*;

//We have declared final class so the subclass(in these case ImmutableDemo) can extend it as it is final i.e we cant inherit
public final class Employee {
	
	    //As we are not initializing any value then we can use constructor other wise we could not use as int ,string they are immutable.
		final String pancardNumber  ;    
		
		//Constructor we are using to initialize the value. As pancardNumber value is not initialized thats y we can use constructor, if it would have been initailzed then we cant use constructor as int, string they are immutable.
		public Employee(String pancardNumber)  
		{    
		this.pancardNumber=pancardNumber;    
		}  
		public String getPancardNumber(){    
		return pancardNumber;    
		}    
		} 


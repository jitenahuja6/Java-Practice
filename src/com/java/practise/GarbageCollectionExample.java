package com.java.practise;

public class GarbageCollectionExample {
	
	//Whenever we will declare finallize then whenever obj will be created then it will perform clean up processing.
	public void finalize()
	{
		System.out.println("Checking finalize");
	}
	
	public static void main(String[] args) {
		GarbageCollectionExample obj = new GarbageCollectionExample();
		GarbageCollectionExample obj1 = new GarbageCollectionExample();
		obj =  null;
		obj1 = null;
		//These is working because on top you have declared finalize.It will perform cleanup processing.
		System.gc();
	}

}

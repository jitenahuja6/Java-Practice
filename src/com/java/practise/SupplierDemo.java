package com.java.practise;

import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Hi Java World";
	}
	public static void main(String[] args) {
		Supplier<String> supplier = new SupplierDemo();
		System.out.println(supplier.get());
	}
	
	

}

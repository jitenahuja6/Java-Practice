package com.optional.practice;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		//Declaration of Optional.
		Optional<String> obj = Optional.empty();
		String book = null;
		//putting book in obj.
		obj = Optional.ofNullable(book);
		//using orElse concept using optional.
		System.out.println(obj.orElse("Sachin").toUpperCase());
	}

}

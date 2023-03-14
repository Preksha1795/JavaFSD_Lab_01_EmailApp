package com.greatlearning.javafsd.emailapptest;

import com.greatlearning.javafsd.emailapp.PasswordGenerator;

public class PasswordGeneratorTest {

	public static void main(String[] args) {
		
		
		PasswordGenerator generator = new PasswordGenerator();
		
		String password = generator.generate();
	
		System.out.println("Generated password ->" + password);
	}
}
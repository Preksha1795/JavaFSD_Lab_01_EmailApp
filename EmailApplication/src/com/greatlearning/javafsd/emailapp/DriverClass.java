package com.greatlearning.javafsd.emailapp;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);

	String firstName = "Preksha";
	String lastName = "Jain";

	System.out.println("Welcome to Email Application");
	System.out.println("Please specify your department number.");

	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. Human Resource");
	System.out.println("4. Legal");


	int departmentOption = input.nextInt();
	String departmentName = "";

	switch (departmentOption) {

		case 1: {
			departmentName = "technical";
			break;
		}
		case 2: {
			departmentName = "admin";
			break;				
		}
		case 3: {
			departmentName = "hr";
			break;				
		}
		case 4: {
			departmentName = "legal";
			break;				
		}

		default : {

			System.out.println("Invalid department option chosen. Please choose a value "
					+ "between 1 and 4");
			System.exit(-1);
		}
	}

	Employee employee = new Employee(firstName, lastName, departmentName);


	ICredentialService credentialServiceImpl = new CredentialServiceImpl();

	credentialServiceImpl.generateEmailAddress(employee);
	String password = credentialServiceImpl.generatePassword();

	employee.setPassword(password);

	credentialServiceImpl.displayCredentials(employee);		

}
}


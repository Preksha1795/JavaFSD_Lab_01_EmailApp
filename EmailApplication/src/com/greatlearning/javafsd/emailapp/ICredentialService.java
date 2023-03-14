package com.greatlearning.javafsd.emailapp;

public interface ICredentialService {
	String generatePassword();
	String generateEmailAddress(Employee employee);
	void displayCredentials(Employee employee);

}

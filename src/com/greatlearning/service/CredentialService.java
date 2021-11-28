package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	private String password="";
	private String email="";

	private static Random random = new Random();

	public  void generateEmailAddress(Employee emp) {

		this.email = emp.getFirstName() + emp. getLasName() + "@" + emp.getDepartment() + ".greatlearning.com";	
	}
	public  void generatePassword() {

		String number="0123456789";
		String strUpper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String strLower="abcdefghijklmnopqrstuvwxyz";
		String splCharater="!@#$%^&*_=+-/";

		String possiblePassChar = number  + strUpper +  strLower  + splCharater;
		int randomCharIndex;

		for (int i=1; i<=8 ; i++) {
			randomCharIndex = random.nextInt(possiblePassChar.length());
			this.password += possiblePassChar.charAt(randomCharIndex);
		}
	}		

	public  void showCredentials (Employee emp) {

		System.out.println("Dear " +  emp.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email 		--> " + this.email);
		System.out.println("Password 	--> " + this.password);

	}
}

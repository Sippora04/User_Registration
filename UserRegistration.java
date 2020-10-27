package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	//UC1: checking first name valid or not
	//UC2: checking last name valid or not
	public static void validateName (String name) {
		String NamePattern = "^[A-Z]{1}[a-zA-z]{2,}";
		Pattern pattern = Pattern.compile(NamePattern);
		Matcher matcher = pattern.matcher(name);		
		if(matcher.find())
			System.out.println( name + " is valid");			
        else 
        	{
        	System.out.println("Name starts with Capital letter and has minimum 3 charachters.");
        	}
	}
	//UC3: Checking Email valid or not
	public static void validateEmail(String Email) {
		String emailPattern = "^[a-zA-Z0-9]+([._+-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$"; // Pattern for Email
		Pattern pattern = Pattern.compile(emailPattern);
		Matcher match = pattern.matcher(Email);
		if(match.find()) {
			System.out.println("Email is Valid");
		}
		else {
		System.out.println("Email is invalid");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName = "";
		String lastName = "";
		String email = "";
		System.out.println("Enter Firstname: ");
		firstName = sc.nextLine();
		validateName (firstName); //firstName method
		
		System.out.println("Enter Lastname: ");
		lastName = sc.nextLine();
		validateName (lastName); //lastName method
		
		System.out.println("Enter email Id: ");
		email = sc.nextLine();
		validateEmail (email); //email method
		sc.close();
	}

}

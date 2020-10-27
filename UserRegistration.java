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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName = "";
		String lastName = "";
		
		System.out.println("Enter Firstname: ");
		firstName = sc.nextLine();
		validateName (firstName); //firstName method
		
		System.out.println("Enter Lastname: ");
		lastName = sc.nextLine();
		validateName (lastName); //lastName method
		sc.close();
	}

}

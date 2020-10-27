package com.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	//UC1: checking first name valid or not
	public static void validateName (String firstName) {
		String NamePattern = "^[A-Z]{1}[a-zA-z]{2,}";
		Pattern pattern = Pattern.compile(NamePattern);
		Matcher matcher = pattern.matcher(firstName);		
		if(matcher.find())
			System.out.println(firstName + " is valid");			
        else 
        	{
        	System.out.println("First name starts with Capital letter and has minimum 3 charachters.");
        	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstName = "";
		System.out.println("Enter Firstname: ");
		firstName = sc.nextLine();
		validateName (firstName);
		sc.close();
	}

}

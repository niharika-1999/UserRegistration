package com.bridgelabz;
import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	public static final Scanner sc=new Scanner(System.in);
	public final String FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	public final String LAST_NAME ="^[A-Z]{1}[a-z]{2,}$";
	public final String EMAIL = "[a-z0-9_]*[.a-z0-9_]*?@[a-z]*.[a-z]*[.a-z]?$";
	
	public boolean checkFirstName(String first_name) //Method to check first name is valid or not
	{
		Pattern pattern = Pattern.compile(FIRST_NAME);
		return pattern.matcher(first_name).matches();
	}
	
	public boolean checkLastName(String last_name) //Method to check last name is valid or not
	{
		Pattern pattern = Pattern.compile(LAST_NAME);
		return pattern.matcher(last_name).matches();
	}
	
	public boolean checkEmail(String email) //Method to check last name is valid or not
	{
		Pattern pattern = Pattern.compile(EMAIL);
		return pattern.matcher(email).matches();
	}
	public static void main(String[] args) //Main function
	{
		System.out.println("Enter first Name:");
		String first_name=sc.next();
		UserRegistration obj = new UserRegistration();
		if(obj.checkFirstName(first_name))
		{
			System.out.println("First name is valid!");
		}
		else
		{
			System.out.println("First name is not valid");
		}
		
		System.out.println("\nEnter Last Name:");
		String last_name=sc.next();
		if(obj.checkLastName(last_name))
		{
			System.out.println("Last name is valid!");
		}
		else
		{
			System.out.println("Last name is not valid");
		}
		
		System.out.println("\nEnter Email:");
		String email=sc.next();
		if(obj.checkEmail(email))
		{
			System.out.println("Email is valid!");
		}
		else
		{
			System.out.println("Email is not valid");
		}

		
	}

}

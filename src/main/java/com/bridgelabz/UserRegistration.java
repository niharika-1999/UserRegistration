package com.bridgelabz;
import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	public static final Scanner sc=new Scanner(System.in);
	public final String FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	
	public boolean validFirstName(String first_name) //Method to check first name is valid or not
	{
		Pattern pattern = Pattern.compile(FIRST_NAME);
		return pattern.matcher(first_name).matches();
	}
	
	public static void main(String[] args) //Main function
	{
		System.out.println("Enter first Name:");
		String first_name=sc.next();
		UserRegistration obj = new UserRegistration();
		if(obj.validFirstName(first_name))
		{
			System.out.println("First name is valid!");
		}
		else
		{
			System.out.println("First name is not valid");
		}
		
	}

}

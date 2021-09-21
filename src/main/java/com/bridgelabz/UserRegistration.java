package com.bridgelabz;
import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	
	public boolean checkFirstName(String firstName) throws UserRegistrationCustomException
	{
		Pattern newPattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		boolean ans = newPattern.matcher(firstName).matches();
		if(ans==true)
			return true;
		else
			throw new UserRegistrationCustomException("Please enter a Valid first name");
	}
	
	public boolean checkLastName(String lastName) throws UserRegistrationCustomException
	{
		Pattern newPattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		boolean ans = newPattern.matcher(lastName).matches();
		if(ans==true)
			return true;
		else
			throw new UserRegistrationCustomException("Please enter a Valid last name");
	}
	
	public boolean checkEmail(String email) throws UserRegistrationCustomException
	{
		Pattern newPattern = Pattern.compile("[a-z0-9_+]*(.[a-z0-9_])*?@[a-z]*.(co|com|edu)(.[a-z])?$");
		boolean ans = newPattern.matcher(email).matches();
		if(ans==true)
			return true;
		else
			throw new UserRegistrationCustomException("Please enter a valid Email ID.");		
	}
	
	public boolean checkPhoneNum(String phoneNum) throws UserRegistrationCustomException
	{
		Pattern newPattern = Pattern.compile("^[0-9]{2}\s?[0-9]{10}$");
		boolean ans = newPattern.matcher(phoneNum).matches();
		if(ans==true)
			return true;
		else
			throw new UserRegistrationCustomException("Please enter a Valid mobile number with country code at the beginning.");
	}
	
	public boolean checkPassword(String password) throws UserRegistrationCustomException
	{
		Pattern newPattern = Pattern.compile("^(?=.*[~!@#$%^&*-+=()])(?=.*[0-9])(?=.*[A-Z]).{8,}");
		boolean ans = newPattern.matcher(password).matches();
		if(ans==true)
			return true;
		else
			throw new UserRegistrationCustomException("Please enter a Valid password. (Follow the password rules).");
	}	
	
	public void emailTest(String email) throws UserRegistrationCustomException
	{
		System.out.println("Sample Email Given to Test: ");
		System.out.print("Sample Email " + email + " is: ");
		if (checkEmail(email)) 
		{
			System.out.printf("Valid Email.\n");
		} 
		else 
		{
			throw new UserRegistrationCustomException("Invalid Email. \n");
		}
	}
}
	
	

		
	



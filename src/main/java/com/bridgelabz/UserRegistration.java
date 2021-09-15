package com.bridgelabz;
import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	public static final Scanner sc=new Scanner(System.in);
	public final String FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	public final String LAST_NAME ="^[A-Z]{1}[a-z]{2,}$";
	public final String EMAIL = "[a-z0-9_]*[.a-z0-9_]*?@[a-z]*.[a-z]*[.a-z]?$";
	public final String PHONE = "^[0-9]{2}\s?[0-9]{10}$";
	public final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=()]).{8,}$";
	
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
	
	public boolean checkEmail(String email) //Method to check email is valid or not
	{
		Pattern pattern = Pattern.compile(EMAIL);
		return pattern.matcher(email).matches();
	}
	
	public boolean checkPhone(String phone_num) //Method to check phone number is valid or not
	{
		Pattern pattern = Pattern.compile(PHONE);
		return pattern.matcher(phone_num).matches();
	}
	
	public boolean checkPassword(String password) //Method to check Password is valid or not
	{
		Pattern pattern = Pattern.compile(PASSWORD);
		return pattern.matcher(password).matches();
	}
	
	public void emailCheck(String email)
	{
		System.out.print(email+"---->");
		if(checkEmail(email))
		{
			System.out.printf("Valid Email\n");
		}
		else
		{
			System.out.printf("Invalid Email\n");
		}
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
		
		System.out.println("\nEnter Phone Number:");
		String phone_num=sc.next();
		if(obj.checkPhone(phone_num))
		{
			System.out.println("Phone number is valid!");
		}
		else
		{
			System.out.println("Phone Number is not valid");
		}
		
		System.out.println("\nEnter Password of minimum 8 characters,1 uppercase, 1 number and spl character :");
		String password=sc.next();
		if(obj.checkPhone(password))
		{
			System.out.println("Password is valid!");
		}
		else
		{
			System.out.println("Password is not valid");
		}
		
		System.out.println("Enter the Email to Test");
		obj.emailCheck("abc@yahoo.com");
		obj.emailCheck("abc-100@yahoo.com");
		obj.emailCheck("abc.100@yahoo.com");
		obj.emailCheck("abc111@abc.com");
		obj.emailCheck("abc-100@abc.net");
		obj.emailCheck("abc.100@abc.com.au");
		obj.emailCheck("abc@1.com");
		obj.emailCheck("abc@gmail.com.com");
		obj.emailCheck("abc+100@gmail.com");
	}
}



		
	



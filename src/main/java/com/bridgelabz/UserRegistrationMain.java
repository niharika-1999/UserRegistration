package com.bridgelabz;
import java.util.Scanner;

public class UserRegistrationMain {
	public static void main(String[] args) throws UserRegistrationCustomException//Main function
	{
		Scanner sc = new Scanner(System.in);
		UserRegistration obj = new UserRegistration();
		System.out.println("Enter your First Name: ");
		String firstName = sc.next();
		System.out.println("Enter your Last Name: ");
		String lastName = sc.next();
		if(obj.checkFirstName(firstName)) 
		{
			System.out.println("The First Name is Valid.");
		} 
		else 
		{
			System.out.println("The First Name  is Invalid.");
		}
		if(obj.checkLastName(lastName)) 
		{
			System.out.println("The Last Name  is Valid.");
		} 
		else 
		{
			System.out.println("The Last Name  is Invalid.");
		}

		System.out.println("Enter your Email ID: ");
		String email = sc.next();
		if(obj.checkEmail(email)) 
		{
			System.out.println("The EMail ID is Valid.");
		} 
		else 
		{
			System.out.println("The EMail ID is Invalid.");
		}

		System.out.println("Enter your Mobile Number with the Country code: ");
		String PhoneNum = sc.next();
		if(obj.checkPhoneNum(PhoneNum)) 
		{
			System.out.println("The Mobile number is Valid.");
		} 
		else 
		{
			System.out.println("The Mobile number is Invalid.");
		}

		System.out.println("Enter Password (min 8 characters, at least one 1 Upper Case, at least 1 number and 1 special character): ");
		String password = sc.next();
		if(obj.checkPassword(password)) 
		{
			System.out.println("The password entered is Valid.");
		} 
		else 
		{
			System.out.println("The password entered is Invalid.");
		}
		obj.emailTest("abc@yahoo.com");
		obj.emailTest("abc123@gmail.a");
		obj.emailTest("abc.100@yahoo.com");
		obj.emailTest("abc@%*.com");
		obj.emailTest("abc+100@gmail.com");
		obj.emailTest("abc()*@gmail.com");
		obj.emailTest(".abc@gmail.com");
		obj.emailTest("abc");
		sc.close();
	}


}


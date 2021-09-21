package com.bridgelabz;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

public class UserRegTest {
	
	@Test
	public void firstNameWhenInputIsValid() throws UserRegistrationCustomException 
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.checkFirstName("Nih");
			Assert.assertEquals(true,result);	
		}
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}	
	}

	@Test
	public void firstNameWhenInputIsInvalid() throws UserRegistrationCustomException 
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.checkFirstName("xyz");
			Assert.assertEquals(false,result);	
		}
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void lastNameWhenInputIsValid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.checkLastName("Rao");
			Assert.assertEquals(true,result);
		}
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void lastNameWhenInputIsInvalid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.checkLastName("rao");
			Assert.assertEquals(false,result);	
		}
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void emailWhenInputIsValid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.checkEmail("nih19@gmail.com");
			Assert.assertEquals(true,result);
		}	
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void emailWhenInputIsInvalid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.checkEmail("nih.com.in");
			Assert.assertEquals(false,result);
		}
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void mobileNoWhenInputIsValid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.checkPhoneNum("911234567890");
			Assert.assertEquals(true,result);	
		}
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void mobileNoWhenInputIsInvalid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.checkPhoneNum("1234");
			Assert.assertEquals(false,result);
		}	
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void passwordWhenInputIsValid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.checkPassword("Password@123");
			Assert.assertEquals(true,result);
		}	
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void passwordWhenInputIsInvalid() throws UserRegistrationCustomException
	{
		UserRegistration obj = new UserRegistration();
		boolean result;
		try
		{
			result = obj.checkPassword("password");
			Assert.assertEquals(false,result);	
		}		
		catch(UserRegistrationCustomException e)
		{
			System.out.println(e.getMessage());
		}
	}

	
	

}

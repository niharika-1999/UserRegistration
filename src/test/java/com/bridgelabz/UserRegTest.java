package com.bridgelabz;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserRegTest {
	
	@Test
	public void firstNameReturnTrueWhenValid()
	{
		UserRegistration obj = new UserRegistration();
		boolean result=obj.checkFirstName("Xyzexample");
		assertEquals(true,result);
	}
	
	@Test
	public void firstNameReturFalseWhenInValid()
	{
		UserRegistration obj = new UserRegistration();
		boolean result=obj.checkFirstName("xyzexample");
		assertEquals(false,result);
	}
	
	@Test
	public void lastNameReturnTrueWhenValid()
	{
		UserRegistration obj = new UserRegistration();
		boolean result=obj.checkFirstName("Lastname");
		assertEquals(true,result);
	}
	
	@Test
	public void lastNameReturnFalseWhenInValid()
	{
		UserRegistration obj = new UserRegistration();
		boolean result=obj.checkFirstName("lastname");
		assertEquals(false,result);
	}
	
	@Test
	public void EmailReturnTrueWhenValid()
	{
		UserRegistration obj = new UserRegistration();
		boolean result=obj.checkEmail("abc@yahoo.com");
		assertEquals(true,result);
	}
	
	@Test
	public void EmailReturnFalseWhenInValid()
	{
		UserRegistration obj = new UserRegistration();
		boolean result=obj.checkEmail("abc.@gmail.com");
		assertEquals(true,result);
	}
	
	
	
	

}

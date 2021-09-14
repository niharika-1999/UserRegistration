package com.bridgelabz;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserRegTest {
	
	@Test
	public void firstNameReturnTrueWhenValid()
	{
		UserRegistration obj = new UserRegistration();
		boolean result=obj.validFirstName("Xyzexample");
		assertEquals(true,result);
	}
	
	@Test
	public void firstNameReturnFalseWhenInvalid()
	{
		UserRegistration obj = new UserRegistration();
		boolean result=obj.validFirstName("xyzexample");
		assertEquals(false,result);
	}
	
	
	

}

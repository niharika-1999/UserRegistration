package com.bridgelabz;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.Before;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegParameterizedTest {
	
	UserRegistration object;
	String input;
	boolean result;
	
	
	@Before
	public void initialize()
	{
		object=new UserRegistration();
	}
	
	public UserRegParameterizedTest(String input , boolean result)
	{
		this.input=input;
		this.result=result;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> input()
	{
		return Arrays.asList(new Object[][] { {"abc.100@yahoo.com",true},{"abc@yahoo.com",true},{"abc-100#yahoo.com",false},});
	}
		
	@Test
	public void emailTest() throws UserRegistrationCustomException
	{
		assertEquals(result,object.checkEmail(input));
	}

}

package com.sgtesting.parametrization;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Users {
	
	@Parameters(value="user")
	@Test
	public void createUser(String user)
	{
		System.out.println("The User "+user+" has created successfully");
	}
	
	@Test
	public void modifyUser()
	{
		System.out.println("The User DemoUser1 has modified successfully");
	}
	
	@Test
	public void deleteUser()
	{
		System.out.println("The User DemoUser1 has deleted successfully");
	}
	
	@BeforeClass
	public void intialization()
	{
		System.out.println("Launch Browser, Navigate Application URL and Login into the Application");
	}

	@AfterClass
	public void tearDown()
	{
		System.out.println("Logout from the Application and Close Application");
		System.out.println("++++++++++++++++++++++++++++++++");
	}
}

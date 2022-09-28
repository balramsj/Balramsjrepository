package users;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserScripts {
	@Test
	public void createUser() {
		System.out.println("User created successful");
	}
	
	@Test
	public void modifyUser() {
		System.out.println("User modified successful");
	}
	
	@Test
	public void deleteUser() {
		System.out.println("User deleted successful");
	}
	
	
	@BeforeSuite
	public void beforeSuiteDemo() {
		System.out.println("User's @BeforeSuite Example");
	}
	
	
	@AfterSuite
	public void afterSuiteDemo() {
		System.out.println("User's @AfterSuite Example");
	}
	
	
	@BeforeTest
	public void beforeTestDemo() {
		System.out.println("User's @BeforeTest example");
	}
	
	
	@AfterTest
	public void afterTestDemo() {
		System.out.println("User's @AfterTest example");
	}
	
	
	@BeforeClass
	public void beforeClassDemo() {
		System.out.println("User's @BeforeClass example");
	}
	
	
	@AfterClass
	public void afterClassDemo() {
		System.out.println("User's @AfterClass example");
	}
	
	
	@BeforeMethod
	public void beforeMethodDemo() {
		System.out.println("User's @BeforeMethod example");
	}
	
	
	@AfterMethod
	public void afterMethodDemo() {
		System.out.println("User's @AfterMethod example");
	}
}

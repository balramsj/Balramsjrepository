package customers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerScripts {
	@Test
	public void createCustomer() {
		System.out.println("Customer created successful");
	}
	
	@Test
	public void modifyCustomer() {
		System.out.println("Customer modified successful");
	}
	
	@Test
	public void deleteCustomer() {
		System.out.println("Customer deleted successful");
	}
	
	
	@BeforeSuite
	public void beforeSuiteDemo() {
		System.out.println("Customer's @BeforeSuite Example");
	}
	
	
	@AfterSuite
	public void afterSuiteDemo() {
		System.out.println("Customer's @AfterSuite Example");
	}
	
	
	@BeforeTest
	public void beforeTestDemo() {
		System.out.println("Customer's @BeforeTest example");
	}
	
	
	@AfterTest
	public void afterTestDemo() {
		System.out.println("Customer's @AfterTest example");
	}
	
	
	@BeforeClass
	public void beforeClassDemo() {
		System.out.println("Customer's @BeforeClass example");
	}
	
	
	@AfterClass
	public void afterClassDemo() {
		System.out.println("Customer's @AfterClass example");
	}
	
	
	@BeforeMethod
	public void beforeMethodDemo() {
		System.out.println("Customer's @BeforeMethod example");
	}
	
	
	@AfterMethod
	public void afterMethodDemo() {
		System.out.println("Customer's @AfterMethod example");
	}
}

package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsDemo {
	
	@Test
	public void assertEqualsDemo1()
	{
		String expected,actual;
		try
		{
			SoftAssert obj=new SoftAssert();
			expected=new String("ProgrammingNew");
			actual="Programming";
			obj.assertEquals(expected, actual);
			System.out.println("It is after execution of assertEquals Method...");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(enabled=false)
	public void assertNotEqualsDemo1()
	{
		String expected,actual;
		try
		{
			SoftAssert obj=new SoftAssert();
			expected=new String("Programming");
			actual="ProgrammingNew";
			obj.assertNotEquals(expected, actual);
			System.out.println("It is after execution of assertNotEquals Method...");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

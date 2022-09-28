package com.sgtesting.softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSameDemo {
	
	
	@Test(enabled=false)
	public void assertSameDemo1()
	{
		String expected,actual;
		try
		{
			SoftAssert obj=new SoftAssert();
			expected=new String("Programming");
			actual="Programming";
			obj.assertSame(expected, actual);
			System.out.println("It is after execution of assertSame Method...");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void assertNotSameDemo1()
	{
		String expected,actual;
		try
		{
			SoftAssert obj=new SoftAssert();
			expected=new String("Programming");
			actual="ProgrammingNew";
			obj.assertNotSame(expected, actual);
			System.out.println("It is after execution of assertNotSame Method...");
			obj.assertAll();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

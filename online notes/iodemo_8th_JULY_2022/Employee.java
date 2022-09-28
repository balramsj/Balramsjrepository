package com.sgtesting.iodemo;

import java.io.Serializable;

public class Employee implements Serializable{
	
	String firstname;
	int age;
	public Employee(String fn,int age)
	{
		firstname=fn;
		this.age=age;
	}
	
	public void showFN()
	{
		System.out.println("First Name :"+firstname);
	}
	
	public void showAge()
	{
		System.out.println("Age :"+age);
	}
}

package com.sgtesting.iodemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) {
		serializableTesting();

	}
	
	private static void serializableTesting()
	{
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		Employee obj=null;
		try
		{
			fout=new FileOutputStream("E:\\CITY\\DEMO\\Employee.ser");
			out=new ObjectOutputStream(fout);
			obj=new Employee("Santosh",19);
			out.writeObject(obj);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				out.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

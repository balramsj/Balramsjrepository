package com.sgtesting.iodemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) {
		deserialization();

	}
	
	private static void deserialization()
	{
		FileInputStream fin=null;
		ObjectInputStream in=null;
		try
		{
			fin=new FileInputStream("E:\\CITY\\DEMO\\Employee.ser");
			in=new ObjectInputStream(fin);
			Employee obj=(Employee) in.readObject();
			
			obj.showFN();
			obj.showAge();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				in.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

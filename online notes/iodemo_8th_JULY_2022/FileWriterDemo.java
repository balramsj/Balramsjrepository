package com.sgtesting.iodemo;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		writeContent();

	}
	
	private static void writeContent()
	{
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("E:\\CITY\\DEMO\\Welcome1.txt",true);
			fw.write("Bangalore is a garden city.");
			fw.write("Bangalore is a capital city of Karnataka.");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fw.flush();
				fw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

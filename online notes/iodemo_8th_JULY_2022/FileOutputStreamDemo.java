package com.sgtesting.iodemo;

import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		writeContent();

	}
	private static void writeContent()
	{
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("E:\\CITY\\DEMO\\Welcome.txt",true);
			String str="Bangalore is a Capital City of Karnataka.";
			str+="Bangalore is a garden city.";
			byte b[]=str.getBytes();
			fout.write(b);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

package com.sgtesting.iodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		writeContent();

	}
	
	private static void writeContent()
	{
		BufferedWriter bw=null;
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("E:\\CITY\\DEMO\\Welcome3.txt",true);
			bw=new BufferedWriter(fw);
			bw.write("Java is a Programming Language");
			bw.newLine();
			bw.write("Java is used for developing Applications");
			bw.newLine();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

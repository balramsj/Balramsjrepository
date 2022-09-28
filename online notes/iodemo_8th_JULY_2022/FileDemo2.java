package com.sgtesting.iodemo;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
	//	createFile1();
	//	renameFile1();
	//	deleteFile1();
		fileCollections();
	}
	
	private static void createFile1()
	{
		try
		{
			File f=new File("E:\\CITY\\DEMO\\Test.txt");
			f.createNewFile();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void renameFile1()
	{
		try
		{
			File f1=new File("E:\\CITY\\DEMO\\Test.txt");
			File f2=new File("E:\\CITY\\DEMO\\Test_New.txt");
			f1.renameTo(f2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteFile1()
	{
		try
		{
			File f=new File("E:\\CITY\\DEMO\\Test_New.txt");
			boolean isdeleted=f.delete();
			System.out.println(isdeleted);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void fileCollections()
	{
		try
		{
			File f=new File("E:\\CITY\\DEMO");
			File f1[]=f.listFiles();
			for(int i=0;i<f1.length;i++)
			{
				if(f1[i].isFile()==true)
				{
					String path=f1[i].getPath();
					System.out.println(path);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

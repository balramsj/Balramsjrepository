package com.sgtesting.iodemo;

import java.io.File;

public class FileDemo3 {
	public static void main(String[] args) {
	//	createFolder();
	//	createNestedFolder();
	//	renameFolder();
	//	deleteFolder();
		folderCollections();
	}
	private static void createFolder()
	{
		File f=new File("E:\\CITY\\DEMO\\Test");
		f.mkdir();
	}
	
	private static void createNestedFolder()
	{
		File f=new File("E:\\CITY\\DEMO\\Test1\\Test2\\Test3\\Test4");
		f.mkdirs();
	}
	
	private static void renameFolder()
	{
		File f=new File("E:\\CITY\\DEMO\\Test");
		File f1=new File("E:\\CITY\\DEMO\\Test_NEW");
		f.renameTo(f1);
	}
	
	private static void deleteFolder()
	{
		File f1=new File("E:\\CITY\\DEMO\\Test1");
		boolean isdeleted=f1.delete();
		System.out.println(isdeleted);
	}
	
	private static void folderCollections()
	{
		try
		{
			File f=new File("E:\\CITY\\DEMO");
			File f1[]=f.listFiles();
			for(int i=0;i<f1.length;i++)
			{
				if(f1[i].isDirectory()==true)
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

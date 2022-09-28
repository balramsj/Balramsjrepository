package com.sgtesting.iodemo;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		File f=new File("E:\\CITY\\DEMO\\Sample.txt");
		//Display Name of the File
		String fname=f.getName();
		System.out.println("File name :"+fname);
		//Display Path of the File
		String path1=f.getPath();
		System.out.println("File Path :"+path1);
		//Display Parent Folder
		String fpath1=f.getParent();
		System.out.println("Parent Folder:"+fpath1);
		//Display Path of the File
		String path2=f.getAbsolutePath();
		System.out.println("File Path :"+path2);
		//is it a File?
		boolean b1=f.isFile();
		System.out.println("Is it a File ?:"+b1);
		//Is it a Folder?
		boolean b2=f.isDirectory();
		System.out.println("Is it a Folder :"+b2);
		//is it a Hidden File?
		boolean b3=f.isHidden();
		System.out.println("Is it a Hidden File ?:"+b3);
		//If file has read permission
		boolean r1=f.canRead();
		System.out.println("Can Read ?:"+r1);
		//If file has write permission
		boolean w1=f.canWrite();
		System.out.println("Can Write ?:"+w1);
		//If File has execute Permission
		boolean x1=f.canExecute();
		System.out.println("Can EXecute ?:"+x1);
	}

}

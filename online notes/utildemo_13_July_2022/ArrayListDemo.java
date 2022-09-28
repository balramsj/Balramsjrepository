package com.sgtesting.utildemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		addElements();
		removeElements();
		readElements1();
		readElements2();
		readElements3();
		withOutGenerics();
	}
	private static void addElements()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add(1,"Apple");
		obj.add("Mango");
		obj.add("Grapes");
		obj.add("Pineapple");
		System.out.println("Elements :"+obj);
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("Blue");
		obj1.add("Green");
		obj1.add("White");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	private static void removeElements()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add(1,"Apple");
		obj.add("Banana");
		obj.add("Grapes");
		obj.add("Pineapple");
		System.out.println("Elements :"+obj);
		obj.remove("Apple");
		System.out.println("Elements :"+obj);
		obj.remove(0);
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	private static void readElements1()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add(1,"Apple");
		obj.add("Banana");
		obj.add("Grapes");
		obj.add("Pineapple");
		System.out.println("Elements :"+obj);
		for(String kk:obj)
		{
			System.out.println(kk);
		}
	}
	
	private static void readElements2()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add(1,"Apple");
		obj.add("Banana");
		obj.add("Grapes");
		obj.add("Pineapple");
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	
	private static void readElements3()
	{
		ArrayList<String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add(1,"Apple");
		obj.add("Banana");
		obj.add("Grapes");
		obj.add("Pineapple");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void withOutGenerics()
	{
		ArrayList obj=new ArrayList();
		System.out.println("Elements :"+obj);
		obj.add(125);
		obj.add('Y');
		obj.add(true);
		obj.add("Apple");
		obj.add(12.75);
		System.out.println("Elements :"+obj);
	}

}

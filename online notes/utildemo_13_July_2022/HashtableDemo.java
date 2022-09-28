package com.sgtesting.utildemo;

import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
	//	addElements();
	//	readAndRemoveElements();
		addElementsWithoutGenerics();
	}
	
	private static void addElements()
	{
		Hashtable<String,String> obj=new Hashtable<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		System.out.println("Elements :"+obj);
	}
	
	private static void readAndRemoveElements()
	{
		Hashtable<String,String> obj=new Hashtable<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		System.out.println("Elements :"+obj);
		
		String v1=obj.get("Lotus");
		System.out.println(v1);
		
		obj.remove("Lotus");
		
		String v2=obj.get("Lotus");
		System.out.println(v2);
	}
	
	private static void addElementsWithoutGenerics()
	{
		Hashtable obj=new Hashtable();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put(150, "Mango is the king of the fruits");
		obj.put('C', "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put(12.75, "Bangalore is a garden city");
		System.out.println("Elements :"+obj);
	}

}

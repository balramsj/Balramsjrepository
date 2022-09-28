package com.sgtesting.utildemo;
import java.util.HashMap;
public class HashMapDemo {
	public static void main(String[] args) {
	//	addElements();
	//	readAndRemoveElements();
	//	readElements1();
		addElementsWithoutGenerics();
	}
	
	private static void addElements()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		obj.put(null, "Null key supported by HashMap");
		System.out.println("Elements :"+obj);
	}
	
	private static void readAndRemoveElements()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		obj.put(null, "Null key supported by HashMap");
		
		System.out.println("Elements :"+obj);
		
		String v1=obj.get("Mango");	
		System.out.println(v1);
		
		obj.remove("Mango");
		
		String v2=obj.get("Mango");	
		System.out.println(v2);
	}
	
	private static void readElements1()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put("Mango", "Mango is the king of the fruits");
		obj.put("Camel", "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put("Bangalore", "Bangalore is a garden city");
		obj.put(null, "Null key supported by HashMap");
		System.out.println("Elements :"+obj);
		
		obj.forEach((k,v) -> System.out.println(k +"===> "+v));
	}
	
	private static void addElementsWithoutGenerics()
	{
		HashMap obj=new HashMap();
		System.out.println("Elements:"+obj);
		obj.put("Lotus", "Lotus is a national flower");
		obj.put(150, "Mango is the king of the fruits");
		obj.put('C', "Camel is a ship of the desert");
		obj.put("Peacock", "Peacock is a national bird");
		obj.put(12.75, "Bangalore is a garden city");
		obj.put(null, "Null key supported by HashMap");
		System.out.println("Elements :"+obj);
	}

}

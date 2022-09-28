   package com.sgtesting.utildemo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListDemo {

	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements1();
	//	readElements2();
	//	readElements3();
	//	listIteratorDemo();
	//	withOutGeenrics();
		firstInFirstOut();
	}
	
	private static void addElements()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add(1,"Apple");
		obj.add("Mango");
		obj.add("Grapes");
		obj.add("Pineapple");
		System.out.println("Elements :"+obj);
		LinkedList<String> obj1=new LinkedList<String>();
		obj1.add("Blue");
		obj1.add("Green");
		obj1.add("White");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	private static void removeElements()
	{
		LinkedList<String> obj=new LinkedList<String>();
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
		LinkedList<String> obj=new LinkedList<String>();
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
		LinkedList<String> obj=new LinkedList<String>();
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
		LinkedList<String> obj=new LinkedList<String>();
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
	
	private static void listIteratorDemo()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Orange");
		obj.add(1,"Apple");
		obj.add("Banana");
		obj.add("Grapes");
		obj.add("Pineapple");
		System.out.println("Elements :"+obj);
		ListIterator<String> list1=obj.listIterator();
		System.out.println("Forward Direction");
		while(list1.hasNext())
		{
			System.out.println(list1.next());
		}
		System.out.println("Backward Direction");
		while(list1.hasPrevious())
		{
			System.out.println(list1.previous());
		}
	}
	
	private static void withOutGeenrics()
	{
		LinkedList obj=new LinkedList();
		System.out.println("Elements :"+obj);
		obj.add(125);
		obj.add('Y');
		obj.add(true);
		obj.add("Apple");
		obj.add(12.75);
		System.out.println("Elements :"+obj);
	}
	
	private static void firstInFirstOut()
	{
		Queue<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(200);
		obj.add(300);
		obj.add(500);
		obj.add(600);
		System.out.println("Elements :"+obj);
		obj.remove();
		System.out.println("Elements :"+obj);
	}

}

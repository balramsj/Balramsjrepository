package com.sgtesting.utildemo;
class MyClass<T>
{
	T obj;
	public void add(T obj)
	{
		this.obj=obj;
	}
	
	public T get()
	{
		return obj;
	}
}
public class GenericsDemo1 {
	public static void main(String[] args) {
		//With Generics
		MyClass<Integer> obj1=new MyClass<Integer>();
		obj1.add(100);
		int a=obj1.get();
		System.out.println(" a :"+a);
		obj1.add(250);
		int b=obj1.get();
		System.out.println(" b :"+b);
		//Without Generics
		MyClass obj2=new MyClass();
		obj2.add("Orange");
		String s=(String) obj2.get();
		System.out.println(" s :"+s);
		obj2.add(200);
		int d=(int) obj2.get();
		System.out.println(" d :"+d);

	}
}

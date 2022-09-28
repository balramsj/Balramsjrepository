package com.sgtesting.utildemo;

public class AutoBoxingDemo {
	public static void main(String[] args) {
		//Primitive variable declaration
		int a=225;
		System.out.println("int a:"+a);
		//Convert it into Wrapper object
		Integer b=Integer.valueOf(a);
		System.out.println("Integer b:"+b);
		//Autoboxing Example
		Integer c=a;
		System.out.println("Integer c:"+c);
	}

}

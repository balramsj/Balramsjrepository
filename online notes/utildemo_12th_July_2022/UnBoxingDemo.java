package com.sgtesting.utildemo;

public class UnBoxingDemo {
	public static void main(String[] args) {
		
		//Wrapper Object
		Integer a=Integer.valueOf(425);
		System.out.println("Integer a:"+a);
		//Store the Wrapper object value in Primitive
		int b=a.intValue();
		System.out.println("int b :"+b);
		//Unboxing example
		int c=a;
		System.out.println("int c :"+c);

	}

}

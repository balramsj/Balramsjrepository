package com.sgtesting.utildemo;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		System.out.println("Adding Elements");
		pushDemo(st, 100);
		pushDemo(st, 200);
		pushDemo(st, 300);
		pushDemo(st, 400);
		pushDemo(st, 500);
		System.out.println("Removing Elements");
		popDemo(st);
	}
	
	private static void pushDemo(Stack st,int a)
	{
		st.push(a);
		System.out.println(a);
	}
	
	private static void popDemo(Stack st)
	{
		int a=(int) st.pop();
		System.out.println(a);
	}

}

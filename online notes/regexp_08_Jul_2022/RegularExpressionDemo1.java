package com.sgtesting.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo1 {
	public static void main(String[] args) {
	//	matchesDemo();
	//	findDemo1();
	//	countOfMatches();
	//	displayMatches();
	//	positionOfMatches();
	//	replaceDemo();
		splitDemo();
	}
	
	private static void matchesDemo()
	{
		Pattern pattern=Pattern.compile("Java");
		Matcher match=pattern.matcher("Java");
		boolean val=match.matches();
		System.out.println(val);
	}
	
	private static void findDemo1()
	{
		Pattern pattern=Pattern.compile("Java");
		Matcher match=pattern.matcher("Java JRE JVM Java JDK");
		boolean val=match.find();
		System.out.println(val);
	}
	
	private static void countOfMatches()
	{
		Pattern pattern=Pattern.compile("Java");
		Matcher match=pattern.matcher("Java JRE JVM Java JDK Java");
		int count=0;
		while(match.find())
		{
			count+=1;
		}
		System.out.println("# of Occurance :"+count);
	}
	
	private static void displayMatches()
	{
		Pattern pattern=Pattern.compile("Java");
		Matcher match=pattern.matcher("Java JRE JVM Java JDK Java");
		
		while(match.find())
		{
			System.out.println(match.group());
		}
	}
	
	private static void positionOfMatches()
	{
		Pattern pattern=Pattern.compile("Java");
		Matcher match=pattern.matcher("Java JRE JVM Java JDK Java");
		
		while(match.find())
		{
			System.out.println(match.group()+" --> Start Pos:"+match.start()+" End Pos:"+match.end());
		}
	} 
	
	private static void replaceDemo()
	{
		Pattern pattern=Pattern.compile("Java");
		Matcher match=pattern.matcher("Java JRE JVM Java JDK Java");
		String str=match.replaceAll("Python");
		System.out.println(str);
	}
	
	private static void splitDemo()
	{
		Pattern pattern=Pattern.compile(",");
		String s[]=pattern.split("Apple,Mango,Orange");
		for(String kk:s)
		{
			System.out.println(kk);
		}
	}
}

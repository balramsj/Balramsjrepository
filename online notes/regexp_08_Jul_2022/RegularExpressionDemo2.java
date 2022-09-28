package com.sgtesting.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {
	public static void main(String[] args) {
	//	regExp1();
	//	regExp2();
		regExp3();
	}
	
	private static void regExp1()
	{
		Pattern pattern=Pattern.compile("[0-9][0-9][0-9]");
		String str="Bangalore received 125 milimeter of rain yesterday";
		Matcher match=pattern.matcher(str);
		boolean val=match.find();
		System.out.println(val);
		String result=match.replaceFirst("many");
		System.out.println(result);
	}
	
	private static void regExp2()
	{
		Pattern pattern=Pattern.compile("[0-9]{3}");
		String str="Bangalore received 125 milimeter of rain yesterday";
		Matcher match=pattern.matcher(str);
		boolean val=match.find();
		System.out.println(val);
		String result=match.replaceFirst("many");
		System.out.println(result);
	}

	private static void regExp3()
	{
		Pattern pattern=Pattern.compile("[A-Za-z]+");
		String str="The temple is at the top of the hill";
		Matcher match=pattern.matcher(str);
		while(match.find())
		{
			System.out.println(match.group());
		}
	}

}

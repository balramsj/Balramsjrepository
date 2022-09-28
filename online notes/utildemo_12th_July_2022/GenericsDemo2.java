package com.sgtesting.utildemo;
class Sample
{
	public static <E> void displayElements(E[] elements)
	{
		for(E element :elements)
		{
			System.out.println(element);
		}
	}
}
public class GenericsDemo2 {
	public static void main(String[] args) {
		String s[]= {"Apple","Mango","Orange","Banana"};
		Sample.displayElements(s);
		
		Integer a[]= {10,20,30,40,50};
		Sample.displayElements(a);
		
		Character ch[]= {'A','S','D','F','G'};
		Sample.displayElements(ch);

	}

}

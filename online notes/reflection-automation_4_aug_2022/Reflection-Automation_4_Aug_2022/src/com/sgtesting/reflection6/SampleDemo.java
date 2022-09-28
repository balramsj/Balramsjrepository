package com.sgtesting.reflection6;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Class[] strparam1=new Class[1];
			strparam1[0]=String.class;
			
			Method m1=obj.getClass().getMethod("showFN", strparam1);
			m1.invoke(obj, new String("DemoUser1"));
			
			Class[] strparam2=new Class[2];
			strparam2[0]=String.class;
			strparam2[1]=String.class;
			
			Method m2=obj.getClass().getMethod("displayDetails", strparam2);
			m2.invoke(obj, new String("DemoUser1"),new String("DemoLastName"));
			
			Class[] intparam1=new Class[1];
			intparam1[0]=Integer.TYPE;
			
			Method m3=obj.getClass().getMethod("showAge", intparam1);
			m3.invoke(obj, 15);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}

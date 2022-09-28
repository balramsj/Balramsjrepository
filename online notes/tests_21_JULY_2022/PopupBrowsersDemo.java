package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBrowsersDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handlingPopupBrowsers();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation1\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void handlingPopupBrowsers()
	{
		WebElement oLink=null;
		try
		{
			oLink=oBrowser.findElement(By.linkText("actiTIME Inc."));
			System.out.println("# of Popups before Click on the Link :"+popupCount());
			oLink.click();
			Thread.sleep(2000);
			System.out.println("# of Popups After Click on the Link :"+popupCount());
			if(popupCount()>0)
			{
				popupBrowsers();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static int popupCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	
	private static void popupBrowsers()
	{
		String ParentBrowser;
		Object popups[];
		try
		{
			ParentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+ParentBrowser);
			popups=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childBrowser=popups[i].toString();
				System.out.println("Child Browser :"+childBrowser);
				oBrowser.switchTo().window(childBrowser);
				String title=oBrowser.getTitle();
				System.out.println("Title of Child Browser :"+title);
				String url=oBrowser.getCurrentUrl();
				System.out.println("URL of Child Browser :"+url);
				oBrowser.findElement(By.linkText("Try Free")).click();
				Thread.sleep(2000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

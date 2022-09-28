package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@DataProvider(name="loginData")
	public Object[][] testData() {
		return new Object[][] {{"admin", "manager"}, {"demouser1","Mercury1"}
		, {"testuser1", "Mercury1"}};
	}
	
	
	@Test(dataProvider = "loginData")
	public void loginToApp(String userName, String password) {
		WebDriver oBrowser = null;
		try {
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//input[@id='username']")).sendKeys(userName);
			oBrowser.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
			oBrowser.findElement(By.xpath("//a[@id='loginButton']")).click();
			Thread.sleep(2000);
			
			String text = oBrowser.findElement(By.xpath("//td[@class='pagetitle']")).getText();
			if(text.equalsIgnoreCase("Enter Time-Track")) {
				System.out.println("Login to actiTime was successful");
			}else {
				System.out.println("Failed to login to actiTime");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			oBrowser.close();
		}
	}
}

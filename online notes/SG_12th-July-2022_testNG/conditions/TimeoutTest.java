package conditions;

import org.testng.annotations.Test;

public class TimeoutTest {
	@Test(timeOut = 2000)
	public void timeTest() {
		try {
			Thread.sleep(3000);
			System.out.println("The Test executed successful");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

package conditions;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test
	public void testScript1() {
		System.out.println("testScript1() has executed successful");
	}
	
	@Test(priority = -1)
	public void testScript2() {
		System.out.println("testScript2() has executed successful");
	}
	
	@Test(priority = 2)
	public void testScript3() {
		System.out.println("testScript3() has executed successful");
	}
	
	@Test(priority = 3)
	public void testScript4() {
		System.out.println("testScript4() has executed successful");
	}
}

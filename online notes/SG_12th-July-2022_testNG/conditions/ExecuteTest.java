package conditions;

import org.testng.annotations.Test;

public class ExecuteTest {
	@Test(enabled = false)
	public void testScript1() {
		System.out.println("testScript1() has executed successful");
	}
	
	@Test
	public void testScript2() {
		System.out.println("testScript2() has executed successful");
	}
	
	@Test(enabled = false)
	public void testScript3() {
		System.out.println("testScript3() has executed successful");
	}
	
	@Test
	public void testScript4() {
		System.out.println("testScript4() has executed successful");
	}
}

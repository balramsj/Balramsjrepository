package conditions;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupDemo {
	@Test(groups = "smoke")
	public void smokeTest1() {
		System.out.println("Testscript for SmokeTest1()");
	}
	
	@Test(groups = "smoke")
	public void smokeTest2() {
		System.out.println("Testscript for SmokeTest2()");
	}
	
	@Test(groups = "regression")
	public void regressionTest1() {
		System.out.println("Testscript for regressionTest1()");
	}
	
	@Test(groups = "regression")
	public void regressionTest2() {
		System.out.println("Testscript for regressionTest2()");
	}
	
	@Test(groups = "regression")
	public void regressionTest3() {
		System.out.println("Testscript for regressionTest3()");
	}
	
	
	@BeforeGroups(value="smoke")
	public void beforeGroup1() {
		System.out.println("@BeforeGroup for SMOKE testcases");
	}
	
	@AfterGroups(value="smoke")
	public void afterGroup1() {
		System.out.println("@AfterGroups for SMOKE testcases");
	}
	
	@BeforeGroups(value="regression")
	public void beforeGroup2() {
		System.out.println("@BeforeGroup for REGRESSION testcases");
	}
	
	@AfterGroups(value="regression")
	public void afterGroup2() {
		System.out.println("@AfterGroups for REGRESSION testcases");
	}
}

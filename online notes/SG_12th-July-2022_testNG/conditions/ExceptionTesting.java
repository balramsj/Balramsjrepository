package conditions;

import org.testng.annotations.Test;

public class ExceptionTesting {
	@Test(expectedExceptions = ArithmeticException.class)
	public void division() {
		int result = 10/5;
		System.out.println(result);
	}
}

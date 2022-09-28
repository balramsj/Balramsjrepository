package conditions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunDemo {
   @Test
   public void createUser() {
	   System.out.println("User created successful");
	   Assert.assertTrue(false);
   }
   
   
   @Test(dependsOnMethods = "createUser", alwaysRun = true)
   public void modifyUser() {
	   System.out.println("User modified successful");
   }
   
   
   @Test(dependsOnMethods = "modifyUser", alwaysRun = true)
   public void deleteUser() {
	   System.out.println("User deleted successful");
   }
}

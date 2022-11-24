package multipleclasses;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class2 extends class1{
//  @Test(priority=4)
	@BeforeTest
  public void payment_details() {
	  System.out.println("payment successfully");
  }
  @Test(priority=5)
  public void delivery_details() {
	  System.out.println("delivered successfully");
  }
}

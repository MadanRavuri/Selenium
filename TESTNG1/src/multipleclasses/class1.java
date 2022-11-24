package multipleclasses;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class class1 {
  @Test(priority=1)
  public void login() {
	  System.out.println("welcome to new tours");
  }
  @Test(priority=2)
  public void cust_details() {
	  System.out.println("customer details updated");
  }
//  @Test(priority=3)
  @AfterTest
  public void prod_details() {
	  System.out.println("product details updated");
  }
}

package Methods;

import org.testng.annotations.Test;

public class program2 {
  @Test(priority=2)
  public void open_browser() {
	  System.out.println("Application succesfully opened");
  }
  @Test(priority=1)
  public void customer_details() {
	  System.out.println("updated cust details");
  }
  @Test(priority=4)
  public void patient_details() {
	  System.out.println("updated patient details");
  }
  @Test(enabled=false)//to skip the method
  public void product_details() {
	  System.out.println("updated product details");
  }
  @Test // Default will execute first
  public void pro_details() {
	  System.out.println("updated pro  details");
  }
}


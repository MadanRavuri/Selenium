package Methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class program3 {
	WebDriver d;
  //@BeforeMethod
	@BeforeClass
  public void opening_browser() {
	  System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.amazon.com/");
	  d.manage().window().maximize();
  }
  @Test(priority=4)
  public void title() {
	  System.out.println(d.getTitle());
  }
  @Test(priority=3)
  public void url() {
	  
	  System.out.println(d.getCurrentUrl());
  }
  @Test(enabled=false)
  public void screenshot() throws IOException {
	  //System.out.println(d.getTitle());
	  File s=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(s,new File("D://amazon3.png"));
	  
  }
  //@AfterMethod
  @AfterClass
  public void close_browser() {
	  d.close();
  }

}

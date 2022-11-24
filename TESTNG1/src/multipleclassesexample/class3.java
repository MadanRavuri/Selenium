package multipleclassesexample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class class3 extends class2 {
	  
	@Test(priority=5)
	  public void screenshot() throws IOException {
		  //System.out.println(d.getTitle());
		  File s=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(s,new File("D://amazon3.png"));
		  
	  }
	  
//	  @Test(priority=6)
	@AfterTest
	  public void close_browser() {
		  d.close();
	  }
}

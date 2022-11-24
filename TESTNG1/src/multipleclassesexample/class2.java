package multipleclassesexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class class2 extends class1 {
	@Test(priority=3)

	  public void url() {
		  
		  System.out.println(d.getCurrentUrl());
	  }
	@Test(priority=4)
	  public void dropdown() {
		  WebElement drop=d.findElement(By.id("searchDropdownBox"));
		  List<WebElement>drop1=drop.findElements(By.tagName("option"));
		  System.out.println(drop1.size());
			for(int i=0;i<drop1.size();i++)
			{
				System.out.println(drop1.get(i).getText());
			}
	  }
}

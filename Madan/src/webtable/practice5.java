package webtable;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice5 {
	WebDriver d;
	public void openingChrome(){
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
	}
	public void get_title() {
		System.out.println(d.getTitle());
	}
	public void get_currenturl() {
		System.out.println(d.getCurrentUrl());
	}
	public void drop() {
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> a1=a.findElements(By.tagName("option"));
		System.out.println(a1.size());
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i).getText());
		}
	}
	public void screenshot() throws IOException {
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D://amazon.png"));
	}
	public void close() {
		d.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		practice5 ob=new practice5();
		ob.openingChrome();
		ob.get_title();
		ob.get_currenturl();
		ob.drop();
		ob.screenshot();
		ob.close();
	}

}

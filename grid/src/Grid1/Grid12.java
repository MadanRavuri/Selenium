package Grid1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid12 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		String nodeUrl="http://localhost:4444/wd/hub";
		String baseUrl="https://www.google.com/";
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		WebDriver d1=new RemoteWebDriver(new URL(nodeUrl),cap);
		
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		
		d1=new ChromeDriver();
		d1.get(baseUrl);
		d1.manage().window().maximize();
		d1.findElement(By.name("q")).sendKeys("manual testing");
		Thread.sleep(2000);
		d1.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		d1.close();
		

	}

}

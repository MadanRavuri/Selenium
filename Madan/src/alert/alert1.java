package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {
	WebDriver d;
	public void alert_message()
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
	}
	public void title() {
		System.out.println(d.getTitle());
	}
	public void url() {
		System.out.println(d.getCurrentUrl());
	}
	public void alert1_message() throws InterruptedException {
		d.findElement(By.id("alertButton")).click();
		
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
	}
	public static void main(String[] args) throws InterruptedException
	{
		alert1 a1=new alert1();
		a1.alert_message();
		a1.title();
		a1.url();
		a1.alert1_message();
	}

}

package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert2 {
	WebDriver d;
	public void opening(){
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
	public void confirm() throws InterruptedException {
		d.findElement(By.id("confirmButton")).click();
		
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		
		alt.accept();
		WebElement c=d.findElement(By.id("confirmResult"));
		System.out.println(c.getText());
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		alert2 a2=new alert2();
		a2.opening();
		a2.title();
		a2.url();
		a2.confirm();
	}

}

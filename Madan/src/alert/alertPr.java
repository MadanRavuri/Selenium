package alert;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPr {
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
		d.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
		Alert al=d.switchTo().alert();

		System.out.println(al.getText());
		
		al.sendKeys("madan");
		Thread.sleep(2000);
		al.accept();
		WebElement c=d.findElement(By.id("promptResult"));
		System.out.println(c.getText());
		
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		alertPr a3=new alertPr();
		a3.opening();
		a3.title();
		a3.url();
		a3.confirm();


	}

}

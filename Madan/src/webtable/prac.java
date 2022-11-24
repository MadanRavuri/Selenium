package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/radio-button");
		d.manage().window().maximize();
		WebElement c=d.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]"));
		System.out.println(c.getText());
		d.findElement(By.xpath("//input[@id='yesRadio']")).click();
	}

}

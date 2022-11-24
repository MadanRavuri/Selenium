package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.dezlearn.com/iframe-example/");
		d.manage().window().maximize();
		
		d.switchTo().frame("iframe1");
		d.findElement(By.xpath("//button[@id=\"u_5_6\"]")).click();;
		String s=d.findElement(By.id("processing")).getText();
		System.out.println(s);
		
	}

}

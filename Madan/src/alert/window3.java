package alert;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class window3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.dezlearn.com/multiple-browser-windows/");
		d.manage().window().maximize();
		String parent_id=d.getWindowHandle();
		System.out.println(parent_id);
		d.findElement(By.id("u_7_8")).click();
		
		Set<String>child_id=d.getWindowHandles();
		System.out.println(child_id);
		
//		for(String handle:child_id) {
//			if(!handle.equalsIgnoreCase(parent_id)) {
//				d.switchTo().window(handle);
//				d.findElement(By.id("email")).sendKeys("9948802701");;
//				d.close();
//			}
//		}
	}

}

package Kdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Met {
	WebDriver d;
	Met(WebDriver d){
		this.d=d;
	}
	public void Opening_Browser() {
		d.get("https://demo.guru99.com/test/newtours/");
	}
	public void Navite() {
		
		d.manage().window().maximize();
	}
	public void User_Name() {
		d.findElement(By.name("userName")).sendKeys("mercury");
	}
	public void Password()
	{
		d.findElement(By.name("password")).sendKeys("mercury");
	}
	public void Click() {
		d.findElement(By.name("submit")).click();
	}
	public void Close() {
		d.close();
	}

}

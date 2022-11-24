package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom2 {
	WebDriver d;
	By fname=By.name("firstName");
	By lname=By.name("lastName");
	By ph=By.name("phone");
	By mail=By.name("userName");
	By add=By.name("address1");
	By contr=By.name("country");
	
	pom2(WebDriver d){
		this.d=d;
	}
	
	public void fname() {
		d.findElement(fname).sendKeys("mercury");
	}
	public void lname() {
		d.findElement(lname).sendKeys("mercury");
	}
	public void ph() {
		d.findElement(ph).sendKeys("1234567890");
	}
	public void Gmail() {
		d.findElement(mail).sendKeys("mercury@gmail.com");
	}
	public void addre() {
		d.findElement(add).sendKeys("vinjamur");
	}
	public void country() {
		d.findElement(contr).sendKeys("INDIA");
	}

}

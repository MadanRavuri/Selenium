package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class pom {
	WebDriver d;
	By username=By.name("userName");
	By password=By.name("password");
	By signon=By.name("submit");
	
	pom(WebDriver d){
		this.d=d;
	}
	
	public void uname() {
		d.findElement(username).sendKeys("mercury");
	}
	public void pass() {
		d.findElement(password).sendKeys("mercury");
	}
	public void signon() {
		d.findElement(signon).click();
	}


//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
//		ChromeDriver d=new ChromeDriver();
//		String base_url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//		d.get(base_url);
//		d.manage().window().maximize();
//		pom a1=new pom(d);
//		a1.uname();
//		a1.pass();
//		a1.signon();
}		



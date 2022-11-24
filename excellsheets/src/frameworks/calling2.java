package frameworks;

import org.openqa.selenium.chrome.ChromeDriver;

public class calling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		String base_url="https://demo.guru99.com/test/newtours/register.php";
		d.get(base_url);
		d.manage().window().maximize();
		pom2 a1=new pom2(d);
		a1.fname();
		a1.lname();
		a1.ph();
		a1.addre();
		a1.Gmail();
		a1.country();
		
		

	}

}

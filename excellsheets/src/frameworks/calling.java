package frameworks;

import org.openqa.selenium.chrome.ChromeDriver;

public class calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		String base_url="https://demo.guru99.com/test/newtours/";
		d.get(base_url);
		d.manage().window().maximize();
		pom a1=new pom(d);
		a1.uname();
		a1.pass();
		a1.signon();

	}

}

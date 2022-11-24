package Exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examcalling {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		FileInputStream f=new FileInputStream("C:\\Users\\sathi\\eclipse-workspace\\excellsheets\\src\\Exam\\Exam1.properties");
		Properties p1=new Properties();
		p1.load(f);
		
		String url1=p1.getProperty("url");
		String username1 = p1.getProperty("username");
		String password1 = p1.getProperty("password");
		Exam2 a1=new Exam2(d);
		
		a1.open(url1);
		a1.login(username1,password1);
		a1.register();
		
	}

}

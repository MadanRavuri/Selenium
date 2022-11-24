package webtable;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter browser:");
		Scanner x=new Scanner(System.in);
		String s=x.next();
		System.out.println("entered browser is:"+s);
		switch(s)
		{
		case "chrome":
		{
			System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://echoecho.com/tools.htm");
			d.manage().window().maximize();
			System.out.println(d.getTitle());
			System.out.println(d.getCurrentUrl());
			break;
		}
		case "firefox":
		{
			FirefoxDriver e=new FirefoxDriver();
			e.get("https://www.google.com/");
			e.manage().window().maximize();
			System.out.println(e.getTitle());
			break;
		}
		default:
			System.out.println("invalid choice");
			break;
		}
	}
}
		


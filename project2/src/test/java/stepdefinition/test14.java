package stepdefinition;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.common.io.Files;

public class test14 {
	WebDriver d;
	FileInputStream f;
	Properties p2=new Properties();
	
	
	
	@Given("user is in newtour page")
	public void user_is_in_newtours_page() throws IOException {
		f=new FileInputStream("C:\\Users\\sathi\\eclipse-workspace\\project2\\src\\test\\java\\properties\\p2.properties");
		p2.load(f);
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	}

	@When("use property for fetch username and password")
	public void use_property_for_fetch_username_and_password() {
		d.findElement(By.name("userName")).sendKeys(p2.getProperty("user"));
		System.out.println(p2.getProperty("user"));
		
		d.findElement(By.name("password")).sendKeys(p2.getProperty("pass"));
		System.out.println(p2.getProperty("pass"));
		
	}

	@Then("user needs to take screenshot")
	public void user_needs_to_take_screenshot() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("D://a9.png"));
	}

	@And("user need to click submit button")
	public void user_need_to_click_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		d.findElement(By.name("submit")).click();
		d.close();
	}


}

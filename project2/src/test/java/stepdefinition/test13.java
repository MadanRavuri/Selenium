package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test13 {
	WebDriver d;
	@Given("user is in newtours page")
	public void user_is_in_newtours_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
	}

	@When("user registers")
	public void user_registers() {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	}

	@Then("user selects India from dropdown")
	public void user_selects_india_from_dropdown() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.name("country")).sendKeys("India");
		Thread.sleep(2000);
	}

	@And("user navigate to home page")
	public void user_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("navigated");
		d.close();
	}


}

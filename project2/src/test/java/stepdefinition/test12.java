package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test12 {
	WebDriver d;

@Given("user is in google page")
public void user_is_in_google_page() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://www.google.com/");
	d.manage().window().maximize();
}

@When("user searches some text")
public void user_searches_some_text() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	d.findElement(By.name("q")).sendKeys("software");
}

@Then("user clicks on button")
public void user_clicks_on_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	Thread.sleep(2000);
	d.findElement(By.name("btnK")).click();

	
}

@And("user navigated to home page")
public void user_navigated_to_home_page() {
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
	System.out.println("navigated");
	d.close();
}


}

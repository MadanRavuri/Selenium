package stepdefinition;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Excel15 {
	WebDriver d;
	FileInputStream f;
	@Given("user open newtours website")
	public void user_open_newtours_website() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();

	  	}

	@When("user need to click register link")
	public void user_need_to_click_register_link() {
	    // Write code here that turns the phrase above into concrete actions
	   d.findElement(By.id("searchDropdownBox")).click();
	 
	}

	@Then("user needs to get country names from dropdown")
	public void user_needs_to_get_country_names_from_dropdown() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		f=new FileInputStream("D://r14.xlsx");
		XSSFWorkbook wc=new XSSFWorkbook(f);
		XSSFSheet ws=wc.getSheet("Sheet1");
		Row r=null;
		Cell x=null;
		
	    WebElement drop=d.findElement(By.id("searchDropdownBox"));
	    List<WebElement> drop2=drop.findElements(By.tagName("option"));
	    for(int i=0;i<drop2.size();i++) {
	    	System.out.println(drop2.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(drop2.get(i).getText());
			drop2.get(i).click();
			if(drop2.get(i).isSelected()) {
				r.createCell(1).setCellValue("pass");
			}
			else {
				r.createCell(1).setCellValue("fail");
			}
	    }
	    FileOutputStream f1=new FileOutputStream("D://r14.xlsx");
		wc.write(f1);
		f1.close();
		
	    
	}

	@And("user navigate back to home page")
	public void user_navigate_back_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	  d.close();
	}


}

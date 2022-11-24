package Test13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class Test16 {
	WebDriver d;
	
	@Given("open and navigate to amazon site")
	public void open_and_navigate_to_amazon_site() {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		d= new ChromeDriver();
		
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
	}

	@When("get all the links,title,url and peint in Excel")
	public void get_all_the_links_title_url_and_peint_in_excel() throws IOException {
		
		FileInputStream f1=new FileInputStream("D://Exm1.xlsx");
		XSSFWorkbook wc=new XSSFWorkbook(f1);
		XSSFSheet ws=wc.getSheet("Sheet3");
		Row r=null;
		Cell x=null;
		r=ws.createRow(0);
		r.createCell(0).setCellValue("linknames");
		r.createCell(1).setCellValue("Title");
		r.createCell(2).setCellValue("Url");
		
		String link1 = "/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[" ;		
		String link2= "]";
		d.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input")).click();
	
		for(int i=1;i<5;i++) {
			
            d.findElement(By.xpath(link1+i+link2)).click();
            
			r=ws.createRow(i+1);
			r.createCell(1).setCellValue(d.getTitle());
			r.createCell(2).setCellValue(d.getCurrentUrl());
			d.navigate().back();
		}
	}

	@Then("capture the screenshot")
	public void capture_the_screenshot() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@And("close the website")
	public void close_the_website() {
	    // Write code here that turns the phrase above into concrete actions
		d.close();
	}

}

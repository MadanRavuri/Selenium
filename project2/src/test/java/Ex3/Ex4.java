package Ex3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

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

public class Ex4 {
	WebDriver d;
	
	@Given("open and navigate to newtours site")
	public void open_and_navigate_to_newtours_site(/*String url1*/) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		d=new ChromeDriver();
	   d.get("https://demo.guru99.com/test/newtours/");
	   d.manage().window().maximize();
	}

	@When("get username and password from property list")
	public void get_username_and_password_from_property_list() throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\sathi\\eclipse-workspace\\project2\\src\\test\\java\\Ex3\\Ex6.properties");
		Properties p2=new Properties();
		p2.load(f);
		System.out.println(p2.getProperty("url"));
		d.findElement(By.name("userName")).sendKeys( p2.getProperty("username"));
		d.findElement(By.name("password")).sendKeys(p2.getProperty("password"));
		d.findElement(By.name("submit")).click();
	}

	@When("click on register button")
	public void click_on_register_button() {
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	}

	@Then("get the dropdown elements and print in excel sheet")
	public void get_the_dropdown_elements_and_print_in_excel_sheet() throws IOException {
		
		FileInputStream f1=new FileInputStream("D://Exm1.xlsx");
		XSSFWorkbook wc=new XSSFWorkbook(f1);
		XSSFSheet ws=wc.getSheet("Sheet2");
		Row r=null;
		Cell x=null;
		
		WebElement drop=d.findElement(By.name("country"));
		List<WebElement> drop1=drop.findElements(By.tagName("option"));
		
		for(int i=0;i<drop1.size();i++) {
			drop1.get(i).click();
			System.out.println(drop1.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(drop1.get(i).getText());
			if(drop1.get(i).isSelected()) {
				r.createCell(1).setCellValue("pass");
			}
			else {
				r.createCell(1).setCellValue("fail");
			}	
		}
		FileOutputStream f2=new FileOutputStream("D://Exm1.xlsx");
		wc.write(f2);
		f2.close();
	}

	@And("close")
	public void close() {
		d.close();
	}


}

package Exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.util.Properties;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Exam2 {
	WebDriver d;

	Exam2(WebDriver d){
		this.d=d;
	}
	
	public void open(String url1) throws IOException {
		
		d.get(url1);
		d.manage().window().maximize();
		
	}
	public void login( String username1 , String password1) {
		
		d.findElement(By.name("userName")).sendKeys(username1);
		d.findElement(By.name("password")).sendKeys(password1);
		d.findElement(By.name("submit")).click();
	}
	public void register() throws IOException {
		FileInputStream f1=new FileInputStream("D://Exm1.xlsx");
		XSSFWorkbook wc=new XSSFWorkbook(f1);
		XSSFSheet ws=wc.getSheet("Sheet1");
		Row r=null;
		Cell x=null;
		
		
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
		WebElement drop=d.findElement(By.name("country"));
		List<WebElement> drop1=drop.findElements(By.tagName("option"));
		
		for(int i=0;i<drop1.size();i++) {
			drop1.get(i).click();
//			System.out.println(drop1.get(i).getText());
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


}

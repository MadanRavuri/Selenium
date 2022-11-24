package Kdd;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.chrome.ChromeDriver;

public class call1 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		
		Met ob=new Met(d);
		
		FileInputStream f=new FileInputStream("D://keys.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet xs=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		
		Iterator<Row> row=xs.iterator();
		while(row.hasNext()) {
			
			r=row.next();
			c=r.getCell(2);
			String actions = c.getStringCellValue();
			
			if(actions.equals("Opening_Browser")) {
				ob.Opening_Browser();
			}
			else if(actions.equals("Navite")){
				ob.Navite();
			}
			else if(actions.equals("User_Name")){
				ob.User_Name();
			}
			else if(actions.equals("Password")){
				ob.Password();
			}
			else if(actions.equals("Click")) {
				ob.Click();
			}
			else {
				ob.Close();
			}
			wb.close();
			
		}
	}

}

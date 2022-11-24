package Module1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("D://r12.xlsx");
		XSSFWorkbook wc=new XSSFWorkbook(f);
		XSSFSheet ws=wc.getSheet("Write");
		Row r=null;
		Cell x=null;
		r=ws.createRow(2);
		r.createCell(1).setCellValue("manual testing");
		
		r=ws.createRow(3);
		r.createCell(2).setCellValue("QTP");
		
		r=ws.createRow(4);
		r.createCell(3).setCellValue("Selenium");
		
		FileOutputStream f1=new FileOutputStream("D://r12.xlsx");
		wc.write(f1);
		f1.close();
		
		
	}

}

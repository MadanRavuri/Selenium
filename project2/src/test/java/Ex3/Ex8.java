package Ex3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
//		ChromeDriver d=new ChromeDriver();
//		
//		FileInputStream f=new FileInputStream("C:\\Users\\sathi\\eclipse-workspace\\project2\\src\\test\\java\\Ex3\\Ex6.propertie");
//		Properties p2=new Properties();
//		p2.load(f);
		
//		String url1=p2.getProperty();
//		String username1 = p2.getProperty("username");
//		String password1 = p2.getProperty("password");
		
		Ex4 a1=new Ex4();
		
		a1.open_and_navigate_to_newtours_site();
		a1.get_username_and_password_from_property_list();
		a1.click_on_register_button();
		a1.get_the_dropdown_elements_and_print_in_excel_sheet();
		a1.close();

	}

}

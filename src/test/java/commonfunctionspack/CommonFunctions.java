package commonfunctionspack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonFunctions {
	
	public WebDriver createDriver() throws IOException {
	
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("resources/application.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("properties file not found. Exiting..");
		}
		
		Properties prop = new Properties();
		prop.load(fis);
		
		
		System.setProperty(prop.getProperty("webdriverproperty"), prop.getProperty("driverpath"));
		WebDriver driver = null;
		if(prop.getProperty("drivertype").equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		else if(prop.getProperty("drivertype").equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	public String returnPropertyValue(String propertykey) throws IOException {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("resources/application.properties");
		} catch (FileNotFoundException e) {
			
			System.out.println("properties file not found. Exiting..");
		}
		
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty(propertykey);
		
		
	}
}

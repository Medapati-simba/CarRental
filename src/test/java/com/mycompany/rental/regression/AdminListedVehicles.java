package com.mycompany.rental.regression;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mycompany.rental.pages.AdminDashBoardOverview;
import com.mycompany.rental.pages.AdminLeftNavigation;
import com.mycompany.rental.pages.AdminListedVehicle;
import com.mycompany.rental.pages.AdminLoginPage;

import commonfunctionspack.CommonFunctions;
import log4JProject.Log4JProjectClass;

public class AdminListedVehicles {
	
	private static Logger log = LogManager.getLogger(Log4JProjectClass.class.getName());
	@Test
	public void AdminListedVehicles() throws InterruptedException, IOException {
		
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("resources/application.properties");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("properties file not found. Exiting..");
//		}
//		
//		Properties prop = new Properties();
//		prop.load(fis);
//		
//		
//		System.setProperty(prop.getProperty("webdriverproperty"), prop.getProperty("driverpath"));
//		WebDriver driver = null;
//		if(prop.getProperty("drivertype").equalsIgnoreCase("firefox")){
//			driver = new FirefoxDriver();
//		}
//		else if(prop.getProperty("drivertype").equalsIgnoreCase("chrome")){
//			driver = new ChromeDriver();
//		}
		
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = cf.createDriver();
		
		driver.manage().window().maximize();
		
		driver.get(cf.returnPropertyValue("baseurl"));
		
		driver.manage().deleteAllCookies();
		log.info("--------------------------------------------------------------------------");
		log.info("---------------------------------ListedVehicles----------------------------");
		log.info("----------------------------------------------------------------------------");
		
		AdminLoginPage alp = new AdminLoginPage(driver);
		AdminLeftNavigation aln = new AdminLeftNavigation(driver);
		AdminDashBoardOverview adbo = new AdminDashBoardOverview(driver);
		AdminListedVehicle alv = new AdminListedVehicle(driver);
		// Admin Loginsetup
		alp.CarRentalAdminLogin();
		log.info("Admin Login Details");
		
		//Admin Click on DashBoard
		aln.getDashboardLink().click();
		log.info("Admin Click on DashBorad link ");
		
		// Admin getting listed vehicle details
		String str = adbo.getListedVehicle().getText();
		System.out.println("No of vehicles Listed "+str);
		log.info("Admin getting listed vehicle details");
		
		// Admin Click on Vehicle Link
		aln.getVehiclesLink().click();
		log.info("Admin Click on Vehicle Link");
		
		// Admin Clicked on Manage Vehicle Tab
		aln.getManageVehicleLink().click();
		log.info("Admin Clicked on Manage Vehicle Tab");
		
		// Admin Checking List from tables
		int no_users = alv.getVehicleCount().size();
		System.out.println("List of vehicles avaible "+no_users);
		log.info("Admin Checking List from tables");
		
		// Admin matching both results
		if(Integer.parseInt(str) == no_users) {
			System.out.println("Both values are matched");
		}else {
			System.out.println("Both values are not matched");
		}
		log.info("Admin matching both results");
		Thread.sleep(7000);
		 driver.close();
	}

}

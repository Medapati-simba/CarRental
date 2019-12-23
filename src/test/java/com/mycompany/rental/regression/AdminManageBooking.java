package com.mycompany.rental.regression;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mycompany.rental.pages.AdminDashBoardOverview;
import com.mycompany.rental.pages.AdminLeftNavigation;
import com.mycompany.rental.pages.AdminLoginPage;
import com.mycompany.rental.pages.AdminManageBookings;

import commonfunctionspack.CommonFunctions;
import log4JProject.Log4JProjectClass;
public class AdminManageBooking {
	
	private static Logger log = LogManager.getLogger(Log4JProjectClass.class.getName());
	
	@Test
	public void AdminManageBookings() throws IOException {
//		System.setProperty("webdriver.gecko.driver", "servers/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://localhost/carrental/admin/");
		
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = cf.createDriver();
		
		driver.manage().window().maximize();
		
		driver.get(cf.returnPropertyValue("baseurl"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		AdminLoginPage alp = new AdminLoginPage(driver);
		AdminLeftNavigation aln = new AdminLeftNavigation(driver);
		AdminDashBoardOverview adbo = new AdminDashBoardOverview(driver);
		AdminManageBookings amb = new AdminManageBookings(driver);
		
		log.info("-------------------------------------------------------------------------");
		log.info("---------------------ManageBooking---------------------------------------");
		log.info("-------------------------------------------------------------------------");
		
		//Admin Login Into application 
		alp.CarRentalAdminLogin();
		log.info("Admin Login Into application");
		
		//Admin Click on Dashboard
		aln.getDashboardLink().click();
		log.info("Admin Click on Dashboard");
		
		//Admin Click on Total Bookings
		String bookings = adbo.getTotalBookings().getText();
		System.out.println(" No of vehicles booked "+bookings);
		log.info("Admin Click on Total Bookings");
		
		// Admin Click on ManageBookings Link on Navigation
		aln.getManageBooking().click();
		log.info("Admin Click on ManageBookings Link on Navigation");
		
		// Admin click on Table List of ManageBookings
		int Bookings = amb.getManageBookingsTable().size();
		System.out.println("No of bookings in table "+Bookings);
		log.info("Admin click on Table List of ManageBookings");
		
		//Admin Comparing results
		if(Integer.parseInt(bookings) == Bookings) {
			System.out.println("Both values are matched");
		}else {
			System.out.println("Both values are not matched");
		}
		log.info("Admin Comparing results");
		
		driver.close();
		
		
	}

}

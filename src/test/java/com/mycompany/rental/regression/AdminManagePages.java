package com.mycompany.rental.regression;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.mycompany.rental.pages.AdminBrandCreation;
import com.mycompany.rental.pages.AdminLeftNavigation;
import com.mycompany.rental.pages.AdminLoginPage;
import com.mycompany.rental.pages.AdminManagePage;

import commonfunctionspack.CommonFunctions;
import log4JProject.Log4JProjectClass;

public class AdminManagePages {
	
	private static Logger log = LogManager.getLogger(Log4JProjectClass.class.getName());
	
	@Test
	public void AdminManagePages() throws InterruptedException, IOException {
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
		AdminManagePage amp = new AdminManagePage(driver);
		
		log.info("------------------------------------------------------------------------------");
		log.info("---------------------AdminManagePages-----------------------------------------");
		log.info("--------------------------------------------------------------------------------");
		
		// CarRental Admin Login
		alp.CarRentalAdminLogin();
		log.info("Admin Login Details");
		
		// Admin Click on ManagePages
		aln.getManagePages().click();
		Thread.sleep(3000);
		log.info("Admin Click on managePages ");
		
		// Admin Selecting from drop down
		Select Abtus = new Select(amp.getAboutUs());
		Abtus.selectByVisibleText("aboutus");
		Thread.sleep(3000);
		log.info("Admin Select the aboutUs Option");
		
		// Admin Details on pageDetails
		amp.getPagedetails().clear();
		Thread.sleep(3000);
		amp.getPagedetails().sendKeys("Our founders had the simple idea of wanting to make renting cars much better. And we’ve flourished because our customers love how we work.\r\n" + 
				"\r\n" + 
				"We started in 2004 as TravelJigsaw. Four years later, we were making 1000 bookings a day. In 2010, we joined the Priceline Group and rebranded as Rentalcars.com.\r\n" + 
				"\r\n" + 
				"Fast forward to today and we’re making 8 million bookings a year (and counting) in over 60,000 locations across 160 countries.\r\n" + 
				"\r\n" + 
				"Our amazing growth relies on our fantastic team. We are 1200 colleagues from 70 nations and we’re all based in Manchester, UK.");
		Thread.sleep(2000);
		log.info("Admin details on managePages");
		
		// Admin Click on Submit Button
		amp.getSubmitButton().click();
		Thread.sleep(3000);
		driver.close();
	}
}

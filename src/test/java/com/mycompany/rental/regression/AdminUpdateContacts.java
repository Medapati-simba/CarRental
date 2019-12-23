package com.mycompany.rental.regression;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mycompany.rental.pages.AdminLeftNavigation;
import com.mycompany.rental.pages.AdminLoginPage;
import com.mycompany.rental.pages.AdminUpdateContact;

import log4JProject.Log4JProjectClass;

public class AdminUpdateContacts {
	
	private static Logger log = LogManager.getLogger(Log4JProjectClass.class.getName());
	
	@Test 
	public void AdminUpdateContact() {
		System.setProperty("webdriver.gecko.driver", "servers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/carrental/admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		AdminLoginPage alp = new AdminLoginPage(driver);
		AdminLeftNavigation aln = new AdminLeftNavigation(driver);
		AdminUpdateContact auc = new AdminUpdateContact(driver);
		
		log.info("-----------------------------------------------------------------------------------------------------");
		log.info("---------------------------------------------UpdateContacts------------------------------------------");
		log.info("-----------------------------------------------------------------------------------------------------");
		
		// admin Login Setup
		alp.CarRentalAdminLogin();
		log.info(" admin Login Setup ");
		
		//Update ContactLink on left Navigation
		aln.getUpdateContactLink().click();
		log.info("Update ContactLink on left Navigation ");
		
		//Admin Address Details
		auc.getAddress().clear();
		auc.getAddress().sendKeys("Test Demo address-7/48-8b, Test Street ");
		log.info("Admin Address Details ");
		
		//Admin Email Address Details 
		auc.getEmailId().clear();
		auc.getEmailId().sendKeys("Test@gmail.com");
		log.info("Admin Email Address Details ");
		
		//Admin ContactNumber details
		auc.getContactNo().clear();
		auc.getContactNo().sendKeys("7382572271");
		log.info("Admin ContactNumber details ");
		
		//Admin Click on Update Button
		auc.getUpdateButton().click();
		log.info("Admin Click on Update Button ");
		
		driver.close();
		
	}
}

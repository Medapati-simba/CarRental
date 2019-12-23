package com.mycompany.rental.regression;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mycompany.rental.pages.AdminBrandCreation;
import com.mycompany.rental.pages.AdminLeftNavigation;
import com.mycompany.rental.pages.AdminLoginPage;

import log4JProject.Log4JProjectClass;
 
public class AdminBrands {
	private static Logger log = LogManager.getLogger(Log4JProjectClass.class.getName());
	@Test
	public void Adminsignin() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "servers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/carrental/admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		AdminLoginPage alp = new AdminLoginPage(driver);
		AdminLeftNavigation aln = new AdminLeftNavigation(driver);
		AdminBrandCreation abc = new AdminBrandCreation(driver);
		
		

//		alp.getUserId().sendKeys("admin");
//		alp.getpassword().sendKeys("Test@12345");		
//		alp.getLoginButton().click();
		
		log.info("------------------------------------------------------------------------");
		log.info("---------------------- Admin Post Brand Test ---------------------------");
		log.info("------------------------------------------------------------------------");
		
		alp.CarRentalAdminLogin();
		log.info("Admin logged in successfully");
		
		aln.getDashboardLink().click();
		log.info("Admin clicked on DashboardLink");
		
		// Create Brand
		aln.getBrandsLink().click();
		log.info("Admin clicked on BrandsLink");
		
		aln.getCreateBrandLink().click();
		log.info("Admin clicked on CreateBrandLink");
		
		abc.getBrandName().sendKeys("KIA Motors");
		log.info("Admin input on BrandName");
		
		abc.getSubmit().click();
		log.info("Admin clicked on Submit button");
		
		driver.close();
	}

}

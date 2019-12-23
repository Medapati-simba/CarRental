package com.mycompany.rental.regression;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mycompany.rental.pages.AdminDashBoardOverview;
import com.mycompany.rental.pages.AdminLeftNavigation;
import com.mycompany.rental.pages.AdminLoginPage;
import com.mycompany.rental.pages.AdminManageBrands;

import log4JProject.Log4JProjectClass;

public class AdminListedBrands {
	
	private static Logger log = LogManager.getLogger(Log4JProjectClass.class.getName());
	
	@Test
	public void adminListedBrands() {
		System.setProperty("webdriver.gecko.driver", "servers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/carrental/admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		AdminLoginPage alp = new AdminLoginPage(driver);
		AdminLeftNavigation aln = new AdminLeftNavigation(driver);
		AdminDashBoardOverview adbo = new AdminDashBoardOverview(driver);
		AdminManageBrands amd = new AdminManageBrands(driver);
		
		log.info("---------------------------------------------------------------------------");
		log.info("----------------------------ListedBrands-----------------------------------");
		log.info("---------------------------------------------------------------------------");
		
		//Admin Login Setup
		alp.CarRentalAdminLogin();
		log.info("Admin Login Setup");
		
		// Admin Click on DashBoard
		aln.getDashboardLink().click();
		log.info("Admin Click on DashBoard");
		
		//admin Click on ListedBrands under DashBoard
		String brands = adbo.getListedBrands().getText();
		System.out.println("Total no of Brands available "+brands);
		log.info("admin Click on ListedBrands under DashBoard");
		
		//Admin Click on Brands Link on navigation
		aln.getBrandsLink().click();
		log.info("Admin Click on Brands Link on navigation");
		
		//Admin Click on ManageBrands link under BrandsLink
		aln.getManageBrands().click();
		log.info("Admin Click on ManageBrands link under BrandsLink");
		
		// Admin Checking Brand TagName
		String BrandName = amd.getBrandsTagName().getText();
		String Brandname1 = amd.getBrandsTagname1().getText();
		if(BrandName.equals(Brandname1)) {
			System.out.println("Both the names are equal ");
		}else {
			System.out.println("Both names are not equal ");
		}
		log.error("Admin expected result of Brand names are negative ");
		
		//Get the no. of brands on first page
		int no_brands = 0;
		for(int i=0; ;i++) {
			no_brands += amd.getManageBrandsTable().size(); //5
			if(!(amd.getNextLink().getCssValue("cursor").equalsIgnoreCase("not-allowed"))) {
				amd.getNextLink().click();
			}
			else {
				break;
			}
			log.info("Got the no. of brands on page"+(i+1));
		}
		
		System.out.println("No of brands from table are "+no_brands);
		
		driver.close();
	}
	
}

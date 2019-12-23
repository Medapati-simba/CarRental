package com.mycompany.rental.regression;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mycompany.rental.pages.AdminDashBoardOverview;
import com.mycompany.rental.pages.AdminLeftNavigation;
import com.mycompany.rental.pages.AdminLoginPage;
import com.mycompany.rental.pages.AdminTestmonial;

import log4JProject.Log4JProjectClass;

public class AdminTestmonials {
private static Logger log = LogManager.getLogger(Log4JProjectClass.class.getName());
	
	@Test
	public void adminQueries() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "servers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/carrental/admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		AdminLoginPage alp = new AdminLoginPage(driver);
		AdminLeftNavigation aln = new AdminLeftNavigation(driver);
		AdminDashBoardOverview adbo = new AdminDashBoardOverview(driver);
		AdminTestmonial at = new AdminTestmonial(driver);
		
		
		log.info("----------------------------------------------------------------------------------------");
		log.info("--------------------------------- Testimonials -----------------------------------------");
		log.info("-----------------------------------------------------------------------------------------");
		
		// Admin Login Setup
		alp.CarRentalAdminLogin();
		log.info("Admin Login Setup");
		
		// Admin Click on DashBoard
		aln.getDashboardLink().click();
		log.info("Admin Click on DashBoard");
		
		// Admin click the Testmonial tab in DashBoard
		String Testmonial = adbo.getTestmonials().getText();
		System.out.println("No of Testmonials "+Testmonial);
		log.info("Admin click the Testmonial tab in DashBoard");
		
		//Admin Click on ManageTestmonials in left Navigation
		aln.getManageTestmonials().click();
		log.info("Admin Click on ManageTestmonials in left Navigation");
		
		//Admin get the testmonial count from table
		int no_Testmonials = at.getTestmonialsCount().size();
		System.out.println("Total count of Testmonials "+no_Testmonials);
		
		//Admin Checking both the results
		if(Integer.parseInt(Testmonial)==no_Testmonials) {
			System.out.println("Both the Results are matched ");
		}else {
			System.out.println("Both the results are not matched");
		}
		log.info("Admin Checking both the results");
		driver.close();
	}
}

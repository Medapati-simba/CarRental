package com.mycompany.rental.regression;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mycompany.rental.pages.AdminDashBoardOverview;
import com.mycompany.rental.pages.AdminLeftNavigation;
import com.mycompany.rental.pages.AdminLoginPage;
import com.mycompany.rental.pages.AdminSubscriber;

import log4JProject.Log4JProjectClass;

public class AdminSubscribers {
	private static Logger log = LogManager.getLogger(Log4JProjectClass.class.getName());
	@Test
	public void adminSubscribers() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "servers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/carrental/admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		AdminLoginPage alp = new AdminLoginPage(driver);
		AdminLeftNavigation aln = new AdminLeftNavigation(driver);
		AdminDashBoardOverview adbo = new AdminDashBoardOverview(driver);
		AdminSubscriber as = new AdminSubscriber(driver);
		
		log.info("----------------------------------------------------------------------------------------");
		log.info("---------------------------------Subscribers---------------------------------------------");
		log.info("-----------------------------------------------------------------------------------------");
		
		// Admin Login Setup
		alp.CarRentalAdminLogin();
		log.info("Admin Login Setup");
		
		// Admin Click on DashBoard
		aln.getDashboardLink().click();
		log.info("Admin Click on DashBoard");
		
		// Admin Click on Total subscribers under DashBoard
		String subscribers = adbo.getSubscribers().getText();
		System.out.println("No of Subscribers "+subscribers);
		log.info("Admin Click on Total subscribers under DashBoard");
		
		// Admin Click Manage subscribers on left navigation
		aln.getManagesubscribers().click();
		log.info("Admin Click Manage subscribers on left navigation");
		
		// Admin get count from subscribers table
		int no_sub = as.getSubscribersCount().size();
		System.out.println("Total no of subscribers "+no_sub);
		log.info("Admin get count from subscribers table");
		
		// Admin Comparing Both results
		if(Integer.parseInt(subscribers) ==no_sub) {
			System.out.println("Both the values are same ");
		}else {
			System.out.println("Both the values are not same ");
		}
		log.info("Admin Comparing Both results");
		Thread.sleep(5000);
		driver.close();
		
			
		
		
		
	}

}

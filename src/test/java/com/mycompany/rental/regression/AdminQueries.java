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
import com.mycompany.rental.pages.AdminManageConatctusQuery;
import com.mycompany.rental.pages.AdminSubscriber;

import commonfunctionspack.CommonFunctions;
import log4JProject.Log4JProjectClass;

public class AdminQueries {
	
	private static Logger log = LogManager.getLogger(Log4JProjectClass.class.getName());
	
	@Test
	public void adminQueries() throws InterruptedException, IOException {
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
		AdminManageConatctusQuery amcq = new AdminManageConatctusQuery(driver);
		
		
		log.info("----------------------------------------------------------------------------------------");
		log.info("---------------------------------Subscribers---------------------------------------------");
		log.info("-----------------------------------------------------------------------------------------");
		
		// Admin Login Setup
		alp.CarRentalAdminLogin();
		log.info("Admin Login Setup");
		
		// Admin Click on DashBoard
		aln.getDashboardLink().click();
		log.info("Admin Click on DashBoard");
		
		// Admin Click on queries tab in DashBoard
		String queries = adbo.getQueries().getText();
		System.out.println("Total no of queries available "+queries);
		log.info("Admin Click on queries tab in DashBoard");
		
		//Admin click on  Manage Conatctus Query tab in left navigation
		aln.getmanageQueries().click();
		log.info("Admin click on  Manage Conatctus Query tab in left navigation");
		
		// Admin Getting count of total Queries from table
		int no_Queries = amcq.getQueriesCount().size();
		System.out.println("Total no of queries from table "+no_Queries);
		log.info("Admin Getting count of total Queries from table");
		
		// Admin matching both the results
		if(Integer.parseInt(queries)==no_Queries) {
			System.out.println("Both the values are matched ");
		}else {
			System.out.println("Both values are not matched ");
		}
		log.info("Admin matching both the results");
		driver.close();
	}
}

package com.mycompany.rental.regression;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mycompany.rental.pages.AdminDashBoardOverview;
import com.mycompany.rental.pages.AdminLeftNavigation;
import com.mycompany.rental.pages.AdminLoginPage;
import com.mycompany.rental.pages.AdminRegUsers;

import log4JProject.Log4JProjectClass;

public class AdminRegisterdUsers {
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
		AdminDashBoardOverview adbo = new AdminDashBoardOverview(driver);
		AdminRegUsers aru = new AdminRegUsers(driver);
		
		log.info("-------------------------------------------------------------------------------");
		log.info("--------------------------AdminRegisterdUsers----------------------------------");
		log.info("-------------------------------------------------------------------------------");
		
		// Admin SignIn 
		alp.CarRentalAdminLogin();
		log.info("Admin Click on CarLogin ");
		
		// Admin click DashBoard link
		aln.getDashboardLink().click();
		log.info("Admin Click on DashboardLink ");
		
		// Admins list of users
		String users = adbo.getRegUsers().getText();
		System.out.println("no of registered user- "+ users);
		log.info("Admin getting list of users ");
		
		// Admin Click RegUser link
		aln.getRegUsersLink().click();
		log.info("Admin Click on RegUserLink");
		
		// Admin getting count from Table
		int no_users = aru.getUsersCount().size();
		System.out.println("No of users in Table "+ no_users);
		log.info("Admin userlist on table ");
		
		if(Integer.parseInt(users) == no_users) {
			System.out.println("Both values are matched");
		}else {
			System.out.println("Both values are not matched");
		}
		
		driver.close();
	}

}

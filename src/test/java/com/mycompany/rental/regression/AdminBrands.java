package com.mycompany.rental.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mycompany.rental.pages.AdminBrandCreation;
import com.mycompany.rental.pages.AdminLeftNavigation;
import com.mycompany.rental.pages.AdminLoginPage;

public class AdminBrands {
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
		
		alp.getUserId().sendKeys("admin");
		alp.getpassword().sendKeys("Test@12345");		
		alp.getLoginButton().click();
		aln.getDashboardLink().click();
		// Create Brand
				aln.getBrandsLink().click();
				aln.getCreateBrandLink().click();
				abc.getBrandName().sendKeys("KIA Motors");
				abc.getSubmit().click();
	}
	
}

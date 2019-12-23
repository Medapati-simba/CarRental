package com.mycompany.rental.regression;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.mycompany.rental.pages.AdminBrandCreation;
import com.mycompany.rental.pages.AdminLeftNavigation;
import com.mycompany.rental.pages.AdminLoginPage;
import com.mycompany.rental.pages.AdminVehiclePosting;

import commonfunctionspack.CommonFunctions;
import log4JProject.Log4JProjectClass;

public class AdminPostVehicle {
	
	private static Logger log = LogManager.getLogger(Log4JProjectClass.class.getName());
	
	@Test
	public void Adminsignin() throws InterruptedException, IOException {
//		//System.setProperty("webdriver.gecko.driver", "servers/geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
//		//WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://localhost/carrental/admin/");
		
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = cf.createDriver();
		
		driver.manage().window().maximize();
		
		driver.get(cf.returnPropertyValue("baseurl"));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		AdminLoginPage alp = new AdminLoginPage(driver);
		AdminLeftNavigation aln = new AdminLeftNavigation(driver);
		AdminVehiclePosting avp = new AdminVehiclePosting(driver);
		
//		//Enter user name on admin login screen
//		alp.getUserId().sendKeys("admin");
//		//Enter user password on admin login screen
//		alp.getpassword().sendKeys("Test@12345");	
//		//Click on Login button
//		alp.getLoginButton().click();
//		
		log.info("------------------------------------------------------------------------");
		log.info("-------------------- Admin Post Vehicle Test ---------------------------");
		log.info("------------------------------------------------------------------------");
		
		alp.CarRentalAdminLogin();
		log.info("Admin logged in successfully");
		
		//Click on Dashboard link after login
		aln.getDashboardLink().click();
		log.info("Admin clicked on Dashboard link");
		
		// Click on Vehicle Link
		aln.getVehiclesLink().click();
		log.info("Admin Clicked on Vehicle Link");
		// Click on Post Vehicle Tab
		aln.getPostVehicleLink().click();
		log.info("Admin Clicked on postvehicle Link");
		Thread.sleep(1000);
		// Entering Vehicle name
		avp.getVehicleTitle().sendKeys("KIA Sportage");
		log.info("Admin input on VehicleTitle");
		// Click on vehicle brand Tab
		avp.getVehicleBrand().click();
		log.info("Admin clicked on vehiclebrand");
		// Selecting the vehicle brand name
		avp.getBrandName("Maruti").click();
		log.info("Admin clicked on Brandname");
		
		// Entering short Description about Vehicle
		avp.getVehicleoverview().sendKeys("The 2019 Kia Sportage is a reasonably priced compact-crossover SUV with very sporty looks,"
				+ " a powerful turbocharged engine option and loads of cool high-tech features. "
				+ "It also provides comfortable seating for four adults, "
				+ "decent cargo space and favorable resale and reliability ratings.");
		log.info("Admin clicked on vehicle overview");
		// Entering Rent Charges per day
		avp.getPricePerDay().sendKeys("10000");
		log.info("Admin input priceperday");
		//Thread.sleep(1000);
		if(avp.getFuelType().isDisplayed()) {
			System.out.println("Fuel Type Displayed");
		}
		// Click on FuelType Link
		avp.getFuelType().click();
		log.info("Admin clicked on fueltype");
		// Selecting FuelElement
		avp.getFuelElement("Diesel").click();
		log.info("Admin clicked on fuelElement");
		// Entering year of the car
		avp.getModelYear().sendKeys("2019");
		log.info("Admin input on model Year");
		// Entering the capacity of the seating
		avp.getSeatingCapacity().sendKeys("6");
		log.info("Admin input on seating capacity");
		
		// Uploading car images into the ImageUpload Tab
		avp.getUploadimage1().sendKeys("F:\\Pictures\\img1.jpg");
		avp.getUploadimage2().sendKeys("F:\\Pictures\\img2.jpg");
		avp.getUploadimage3().sendKeys("F:\\Pictures\\img3.jpg");
		avp.getUploadimage4().sendKeys("F:\\Pictures\\img4.jpg");
		avp.getUploadimage5().sendKeys("F:\\Pictures\\img5.jpg");
		
		// Entering Specifications of the car
		avp.getAirConditioner().click();
		log.info("Admin clicked on Airconditioner");
		// Entering Specifications of the car
		avp.getPowerdoorLocks().click();
		log.info("Admin clicked on powerdoor lock");
		// Entering Specifications of the car
		avp.getpassengerairbag().click();
		log.info("Admin clicked on passengerairbag");
		// Entering Specifications of the car
		avp.getcrashcensor().click();
		log.info("Admin clicked on crashcensor");
		// Entering Specifications of the car
		avp.getleatherseats().click();
		log.info("Admin clicked on leatherseats");
		// Final submittion of the car details 
		
		avp.getSubmit().click();
		driver.close();
		
		
	
	
	}

}

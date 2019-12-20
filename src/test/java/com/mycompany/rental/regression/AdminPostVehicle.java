package com.mycompany.rental.regression;

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

public class AdminPostVehicle {
	@Test
	public void Adminsignin() throws InterruptedException {
		//System.setProperty("webdriver.gecko.driver", "servers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/carrental/admin/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		AdminLoginPage alp = new AdminLoginPage(driver);
		AdminLeftNavigation aln = new AdminLeftNavigation(driver);
		AdminVehiclePosting avp = new AdminVehiclePosting(driver);
		
		//Enter user name on admin login screen
		alp.getUserId().sendKeys("admin");
		//Enter user password on admin login screen
		alp.getpassword().sendKeys("Test@12345");	
		//Click on Login button
		alp.getLoginButton().click();
		
		//Click on Dashboard link after login
		aln.getDashboardLink().click();
		
		
		aln.getVehiclesLink().click();
		aln.getPostVehicleLink().click();
		Thread.sleep(1000);
		avp.getVehicleTitle().sendKeys("KIA Sportage");
		avp.getVehicleBrand().click();
		avp.getBrandName("Maruti").click();

		avp.getVehicleoverview().sendKeys("The 2019 Kia Sportage is a reasonably priced compact-crossover SUV with very sporty looks,"
				+ " a powerful turbocharged engine option and loads of cool high-tech features. "
				+ "It also provides comfortable seating for four adults, "
				+ "decent cargo space and favorable resale and reliability ratings.");
		avp.getPricePerDay().sendKeys("10000");
		//Thread.sleep(1000);
		if(avp.getFuelType().isDisplayed()) {
			System.out.println("Fuel Type Displayed");
		}
		avp.getFuelType().click();
		avp.getFuelElement("Diesel").click();
		avp.getModelYear().sendKeys("2019");
		avp.getSeatingCapacity().sendKeys("6");
		
		avp.getUploadimage1().sendKeys("F:\\Pictures\\img1.jpg");
		avp.getUploadimage2().sendKeys("F:\\Pictures\\img2.jpg");
		avp.getUploadimage3().sendKeys("F:\\Pictures\\img3.jpg");
		avp.getUploadimage4().sendKeys("F:\\Pictures\\img4.jpg");
		avp.getUploadimage5().sendKeys("F:\\Pictures\\img5.jpg");
		
		avp.getAirConditioner().click();
		avp.getPowerdoorLocks().click();
		avp.getpassengerairbag().click();
		avp.getcrashcensor().click();
		avp.getleatherseats().click();
		//avp.getSubmit().click();
		//driver.close();
		
		
		
//		
//		WebElement RegUsers = driver.findElements(By.xpath("//i[@class='fa fa-arrow-right']")).get(0);
//		RegUsers.click();
//		
//		WebElement testdropdown = driver.findElement(By.xpath("//select[@name='zctb_length']"));
//		Select dropdown = new Select(testdropdown);
//		dropdown.selectByIndex(2);
//		Thread.sleep(3000);
//		
//		WebElement HomeTab = driver.findElement(By.xpath("//a[contains(text(),'Car Rental Portal | Admin Panel')]"));
//		HomeTab.click();
//		
//	WebElement Brands = driver.findElement(By.xpath("//a[@class='parent'][contains(text(),'Brands')]"));
//	Select dropdown1 = new Select(Brands);
//	dropdown1.selectByVisibleText("Create Brand");
		
//		WebElement Brands = ;
//		Brands.click();
//		WebElement CreateBrands = ;
//		CreateBrands.click();
//		
//		WebElement car = driver.findElement(By.xpath("//input[@id='brand']"));
//		car.sendKeys("Tesla cyberTruck");
//		WebElement submit = ;
//		submit.click();
//		
//		WebElement Brands1 = driver.findElement(By.xpath("//a[@class='parent'][contains(text(),'Brands')]"));
//		Brands1.click();
////		driver.navigate().back();
//		WebElement ManageBrands = driver.findElement(By.xpath("//a[contains(text(),'Manage Brands')]"));
//		ManageBrands.click();
//		WebElement Cancel = driver.findElements(By.xpath("//i[@class='fa fa-close']")).get(6);
//		Cancel.click();
//		Thread.sleep(3000);
//		//javascript confirm
//		driver.switchTo().alert().accept();
//		WebElement ManageBooking = driver.findElement(By.xpath("//a[contains(text(),'Manage Booking')]"));
//		ManageBooking.click();
//		
//		
	
	}

}

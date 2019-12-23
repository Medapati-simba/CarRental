package com.mycompany.rental.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminLeftNavigation {
	WebDriver driver;
	public AdminLeftNavigation(WebDriver driver) {
		this.driver = driver;
	}
	
	
	// Create Brand
	
//	 WebElement Brands = driver.findElement(By.xpath("//a[@class='parent'][contains(text(),'Brands')]"));
//	Select dropdown1 = new Select(Brands);
//	dropdown1.selectByVisibleText("Create Brand");
	
	//Brands link on left navigation
	public WebElement getBrandsLink() {
		return driver.findElement(By.xpath("//a[@class='parent'][contains(text(),'Brands')]"));
	}
	
	//Create Brand link under Brands link under left navigation
	public WebElement getCreateBrandLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Create Brand')]"));
	}
	
	// Manage Brands Link under Brands link under navigation
	public WebElement getManageBrands() {
		return driver.findElement(By.xpath("//a[@href='manage-brands.php'][contains(text(),'Manage Brands')]"));
	}
	// Vehicles link on left navigation
	public WebElement getVehiclesLink() {
		return driver.findElement(By.xpath("//a[@class='parent'][contains(text(),'Vehicles')]"));	
	}
	// Create PostVehicle link under vehicles link on left navigation
	public WebElement getPostVehicleLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Post a Vehicle')]"));
	}
	// Create Manage Vehicle Link under Vehicle Tab
	public WebElement getManageVehicleLink() {
		return  driver.findElement(By.xpath(("//a[@href='manage-vehicles.php'][contains(text(),'Manage Vehicles')]")));
	}
	// ManageBookings Link on left navigation 
	public WebElement getManageBooking() {
		return driver.findElement(By.xpath("//a[@href='manage-bookings.php'][contains(text(),' Manage Booking')]"));
	}
	 // DashBoard Link on left navigation
	public WebElement getDashboardLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]"));
	}
	 // RegUsers Link on left navigation
	public WebElement getRegUsersLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Reg Users')]"));
	}
	// Testmonials link on left navigation
	public WebElement getManageTestmonials() {
		return driver.findElement(By.xpath("//a[contains(text(),' Manage Testimonials')]"));
	}
	//  Manage Conatctus Query link on left navigation
	public WebElement getmanageQueries() {
		return driver.findElement(By.xpath("//a[contains(text(),' Manage Conatctus Query')]"));
	}
	// Update Contact Info on Left navigation
	public WebElement getUpdateContactLink() {
		return driver.findElement(By.xpath("//a[@href='update-contactinfo.php']"));
	}
	// Manage Pages on left navigation
	public WebElement getManagePages() {
		return driver.findElement(By.xpath("//a[@href='manage-pages.php']"));
	}
	// Manage subscribers on left navigation
	public WebElement getManagesubscribers() {
		return driver.findElement(By.xpath("//a[@href='manage-subscribers.php'][contains(text(),' Manage Subscribers')]"));
	}
	
	// Select Brand
//	WebElement SelectBrand = driver.findElement(By.xpath("//span[contain(text(),'filter-option pull-left']"));
//	Select dropdown = new Select(SelectBrand);
//	dropdown.selectByVisibleText("KIA Motors");
	
	
}

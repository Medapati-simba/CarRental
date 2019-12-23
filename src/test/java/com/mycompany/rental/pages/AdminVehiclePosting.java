package com.mycompany.rental.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminVehiclePosting {
	WebDriver driver;
	public AdminVehiclePosting(WebDriver driver) {
		this.driver = driver;
	}
	
	// Fill Vehicle Title Column
	public WebElement getVehicleTitle() {
		return driver.findElement(By.xpath("//input[@name='vehicletitle']"));
	}
	
	// Brand Select dropdown button
	public WebElement getVehicleBrand() {
		//return driver.findElement(By.xpath("//span[contain(text(),'filter-option pull-left']"));
		return driver.findElement(By.xpath("(//button[@title='Select'])[1]"));
	}
	
	// Brands under Select Dropdown
	public WebElement getBrandName(String BrandName) {
		return driver.findElement(By.xpath("//span[text()='"+BrandName+"']"));
	}
//	// Selecting the brands of the vehicle
//	public WebElement getVehicleBrandName() {
//		return 
//	}
	// Vehicle Overview Column
	public WebElement getVehicleoverview() {
		return driver.findElement(By.xpath("//textarea[@name='vehicalorcview']"));
	}
	// Fixing price per day
	public WebElement getPricePerDay() {
		return driver.findElement(By.xpath("//input[@name='priceperday']"));
	}
	// FuelType under Select Dropdown	
	public WebElement getFuelType() {
		//return driver.findElements(By.xpath("//button[@title='Select']")).get(1);	
		return driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle btn-default'])[2]"));
	}
	// FuelElement under Select Dropdown
		public WebElement getFuelElement(String Fueltype) {
			return driver.findElement(By.xpath("//span[text()='"+Fueltype+"']"));
		}
	// Model Year of the car
	public WebElement getModelYear() {
		return driver.findElement(By.xpath("//input[@name='modelyear']"));
	}
	// Seating Capacity in the car
	public WebElement getSeatingCapacity() {
		return driver.findElement(By.xpath("//input[@name='seatingcapacity']"));
	}
	
	// Upload image1 into the image column
	public WebElement getUploadimage1() {
		return driver.findElement(By.xpath("//input[@name='img1']"));
	}
	//  Upload image2 into the image column
	public WebElement getUploadimage2() {
		return driver.findElement(By.xpath("//input[@name='img2']"));
	}
	//  Upload image3 into the image column
	public WebElement getUploadimage3() {
		return driver.findElement(By.xpath("//input[@name='img3']"));
	}
	// Upload image4 into the image column
	public WebElement getUploadimage4() {
		return driver.findElement(By.xpath("//input[@name='img4']"));
	}
	// Upload image5 into the image column
	public WebElement getUploadimage5() {
		return driver.findElement(By.xpath("//input[@name='img5']"));
	}
	// selecting airconditioner CheckBox
	public WebElement getAirConditioner() {
		return driver.findElement(By.xpath("//input[@name='airconditioner']"));
	}
	// selecting powerdoorlocks Checkbox
	public WebElement getPowerdoorLocks() {
		return driver.findElement(By.xpath("//input[@name='powerdoorlocks']"));
	}
	// selecting passengerairbag checkbox
	public WebElement getpassengerairbag() {
		return driver.findElement(By.xpath("//input[@name='passengerairbag']"));
	}
	// selecting crashcensor checkbox
	public WebElement getcrashcensor() {
		return driver.findElement(By.xpath("//input[@name='crashcensor']"));
	}
	// selecting leatherseats checkbox
	public WebElement getleatherseats() {
		return driver.findElement(By.xpath("//input[@name='leatherseats']"));
	}
	// Final Submission of Details
	public WebElement getSubmit() {
		return driver.findElement(By.xpath("//button[@name='submit']"));
	}
	
		
}	


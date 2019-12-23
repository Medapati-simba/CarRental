package com.mycompany.rental.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminDashBoardOverview {
	WebDriver  driver;
	public AdminDashBoardOverview(WebDriver driver) {
		this.driver = driver;
	}
	
	// Checking Registered users
	public WebElement getRegUsers() {
		//return  driver.findElement(By.xpath("//div[contains(text(),'7')]"));
		return driver.findElements(By.cssSelector(".stat-panel-number.h1")).get(0);
		//tbody//tr""//tbody//tr"
	}
	// Admin Checking TotalBookings
		public WebElement getListedVehicle() {
			return driver.findElements(By.xpath("//div[@class='stat-panel-number h1 ']")).get(1);
		}
	// Admin Checking listed Vehicles
		public WebElement getTotalBookings() {
			return driver.findElements(By.xpath("//div[@class='stat-panel-number h1 ']")).get(2);
		}
	// Admin Checking TotalBookings
		public WebElement getListedBrands() {
			return driver.findElements(By.xpath("//div[@class='stat-panel-number h1 ']")).get(3);
		}		
	//Admin Checking TotalSubscribers
		public WebElement getSubscribers() {
			return driver.findElements(By.xpath("//div[@class='stat-panel-number h1 ']")).get(4);
		}
	//Admin Checking Total Queries
		public WebElement getQueries() {
			return driver.findElements(By.xpath("//div[@class='stat-panel-number h1 ']")).get(5);
		}
	//Admin Checking Testmonials
		public WebElement getTestmonials() {
			return driver.findElements(By.xpath("//div[@class='stat-panel-number h1 ']")).get(6);
		}
}

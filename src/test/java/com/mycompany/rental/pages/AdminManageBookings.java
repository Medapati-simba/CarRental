package com.mycompany.rental.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminManageBookings {
	WebDriver driver;
	public  AdminManageBookings(WebDriver driver) {
		this.driver = driver;
	}
	// Admin List of Bookings count
	public List<WebElement> getManageBookingsTable() {
		return driver.findElements(By.xpath("//td[@class='sorting_1']"));
		//return driver.findElements((By.xpath("//tbody//tr"));
	}
}

package com.mycompany.rental.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminUpdateContact {
	WebDriver  driver;
	public AdminUpdateContact(WebDriver driver) {
		this.driver = driver;
	}
	// Admin Address Details
	public WebElement getAddress() {
		return driver.findElement(By.xpath("//textarea[@name='address']"));
	}
	// Admin Email address Details
	public WebElement getEmailId( ) {
		return driver.findElement(By.xpath("//input[@type='email']"));
	}
	// Admin Contact Number Details
	public WebElement getContactNo() {
		return driver.findElement(By.xpath("//input[@name='contactno']"));
	}
	// Admin Click on Update Buttons
	public WebElement getUpdateButton() {
		return driver.findElement(By.xpath("//button[@name='submit']"));
	}	
}

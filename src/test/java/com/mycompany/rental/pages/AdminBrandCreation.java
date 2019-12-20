package com.mycompany.rental.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminBrandCreation {
	WebDriver driver;
	public AdminBrandCreation(WebDriver driver) {
		this.driver = driver;
	}
	// Entered Brand name in the brand column
	public WebElement getBrandName() {
		return driver.findElement(By.xpath("//input[@name='brand']"));
	}
	// click on submit button
	public WebElement getSubmit() {
		return driver.findElement(By.xpath("//button[@name='submit']"));
	}
	
}

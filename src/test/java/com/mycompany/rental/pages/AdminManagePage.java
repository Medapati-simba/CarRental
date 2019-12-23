package com.mycompany.rental.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import log4JProject.Log4JProjectClass;

public class AdminManagePage {
	
	
	WebDriver driver;
	public AdminManagePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Selecting from Dropdown
	public WebElement getAboutUs() {
		return driver.findElement(By.xpath("//select[@name='menu1']"));
	}
	// Admin Details in page Details
	public WebElement getPagedetails() {
		return driver.findElement(By.xpath("//div[contains(@class,'nicEdit-main')]"));
	}
	// Admin Click on submit Button
		public WebElement getSubmitButton() {
			return driver.findElement(By.xpath("//button[@id='submit']"));
		}		
}

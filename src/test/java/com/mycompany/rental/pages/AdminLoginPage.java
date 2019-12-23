package com.mycompany.rental.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLoginPage {
	WebDriver driver;
	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	// Entering Username in Login Page
	public WebElement getUserId() {
		return driver.findElement(By.xpath("//input[@name='username']"));
	}
	// Entering Password in Login Page
	public WebElement getpassword() {
		return driver.findElement(By.xpath("//input[@name='password']"));
	}
	// Click on Login Button
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//button[@name='login']"));
	}
	public void CarRentalAdminLogin() {
		getUserId().sendKeys("admin");
		getpassword().sendKeys("Test@12345");
		getLoginButton().click();
	}
}

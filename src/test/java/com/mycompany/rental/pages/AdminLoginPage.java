package com.mycompany.rental.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLoginPage {
	WebDriver driver;
	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getUserId() {
		return driver.findElement(By.xpath("//input[@name='username']"));
	}
	public WebElement getpassword() {
		return driver.findElement(By.xpath("//input[@name='password']"));
	}
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//button[@name='login']"));
	}
}

package com.mycompany.rental.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminRegUsers {
	WebDriver driver;
	public  AdminRegUsers(WebDriver driver) {
		this.driver = driver;
	}
	// Admin RegUsers count
	public List<WebElement> getUsersCount() {
		return driver.findElements(By.xpath("//td[@class='sorting_1']"));
		//return driver.findElements((By.xpath("//tbody//tr"));
	}
}

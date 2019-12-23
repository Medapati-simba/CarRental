package com.mycompany.rental.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminTestmonial {
	WebDriver driver;
	public  AdminTestmonial(WebDriver driver) {
		this.driver = driver;
	}
	// Admin Total Testmonials count
	public List<WebElement> getTestmonialsCount() {
		return driver.findElements(By.xpath("//td[@class='sorting_1']"));
		//return driver.findElements((By.xpath("//tbody//tr"));
	}
}

package com.mycompany.rental.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminSubscriber {
	WebDriver driver;
	public  AdminSubscriber(WebDriver driver) {
		this.driver = driver;
	}
	// Admin Subscribers count
	public List<WebElement> getSubscribersCount() {
		return driver.findElements(By.xpath("//td[@class='sorting_1']"));
		//return driver.findElements((By.xpath("//tbody//tr"));
	}
}

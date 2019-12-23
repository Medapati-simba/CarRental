package com.mycompany.rental.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminManageConatctusQuery {
	WebDriver driver;
	public  AdminManageConatctusQuery(WebDriver driver) {
		this.driver = driver;
	}
	// Admin Total Queries count
	public List<WebElement> getQueriesCount() {
		return driver.findElements(By.xpath("//td[@class='sorting_1']"));
		//return driver.findElements((By.xpath("//tbody//tr"));
	}
}

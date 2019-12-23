package com.mycompany.rental.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminListedVehicle {
	WebDriver driver;
	public  AdminListedVehicle(WebDriver driver) {
		this.driver = driver;
	}
	// Admin ListedVehicles count
	public List<WebElement> getVehicleCount() {
		return driver.findElements(By.xpath("//td[@class='sorting_1']"));
		//return driver.findElements((By.xpath("//tbody//tr"));
	}
}

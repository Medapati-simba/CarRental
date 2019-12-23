package com.mycompany.rental.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminManageBrands {
	WebDriver driver;
	public  AdminManageBrands(WebDriver driver) {
		this.driver = driver;
	}
	// Admin List of ManageBrands
	public List<WebElement> getManageBrandsTable() {
		return driver.findElements(By.xpath("//td[@class='sorting_1']"));
	//return driver.findElements((By.xpath("//tbody//tr"));
	}
	
	public WebElement getNextLink() {
		return driver.findElement(By.xpath("//a[text()='Next']"));
	}
	//Admin getting BrandTagName
	public WebElement getBrandsTagName() {
		return driver.findElement(By.xpath("//h2[@class='page-title']"));
	}
	//Admin getting text of listing brands
	
	public WebElement getBrandsTagname1() {
		
		return driver.findElement(By.xpath("//div[@class='panel-heading']"));
	}
}

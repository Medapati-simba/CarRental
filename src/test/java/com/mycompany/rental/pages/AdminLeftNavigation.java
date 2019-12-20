package com.mycompany.rental.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminLeftNavigation {
	WebDriver driver;
	public AdminLeftNavigation(WebDriver driver) {
		this.driver = driver;
	}
	
	//Dashboard link on left navigation
	public WebElement getDashboardLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Dashboard')]"));
	}
	// Create Brand
	
//	 WebElement Brands = driver.findElement(By.xpath("//a[@class='parent'][contains(text(),'Brands')]"));
//	Select dropdown1 = new Select(Brands);
//	dropdown1.selectByVisibleText("Create Brand");
	
	//Brands link on left navigation
	public WebElement getBrandsLink() {
		return driver.findElement(By.xpath("//a[@class='parent'][contains(text(),'Brands')]"));
	}
	
	//Create Brand link under Brands link under left navigation
	public WebElement getCreateBrandLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Create Brand')]"));
	}
	// Vehicles link on left navigation
	public WebElement getVehiclesLink() {
		return driver.findElement(By.xpath("//a[@class='parent'][contains(text(),'Vehicles')]"));	
	}
	// Create PostVehicle link under vehicles link on left navigation
	public WebElement getPostVehicleLink() {
		return driver.findElement(By.xpath("//a[contains(text(),'Post a Vehicle')]"));
	}
	
	
	// Select Brand
//	WebElement SelectBrand = driver.findElement(By.xpath("//span[contain(text(),'filter-option pull-left']"));
//	Select dropdown = new Select(SelectBrand);
//	dropdown.selectByVisibleText("KIA Motors");
	
	
}

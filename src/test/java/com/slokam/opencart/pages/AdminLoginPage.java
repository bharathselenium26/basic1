package com.slokam.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminLoginPage {

	WebDriver driver;
	
	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String username,String password) {
		driver.findElement(By.id("input-username")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
	}
}

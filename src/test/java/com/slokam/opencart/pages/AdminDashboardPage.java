package com.slokam.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminDashboardPage {

	WebDriver driver;
	
	public AdminDashboardPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void logout() {
		driver.findElement(By.cssSelector(".fa-sign-out")).click();
	}
}

package com.slokam.opencart.pfpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminDashboardPagePF {

	WebDriver driver;
	
	public AdminDashboardPagePF(WebDriver driver){
		this.driver = driver;
	}
	
	public void logout() {
		driver.findElement(By.cssSelector(".fa-sign-out")).click();
	}
}

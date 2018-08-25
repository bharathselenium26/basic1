package com.slokam.petclinic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {

	WebDriver driver;
	
	public WelcomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickReturningUser() {
		driver.findElement(By.xpath("//a[@class='btn btn-success']")).click();
	}
	
	public void clickFirstTimeUser() {
		driver.findElement(By.cssSelector(".btn-info")).click();
	}
}

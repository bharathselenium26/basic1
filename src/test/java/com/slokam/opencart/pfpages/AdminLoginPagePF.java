package com.slokam.opencart.pfpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.slokam.opencart.pages.AdminLoginPage;

public class AdminLoginPagePF {

	WebDriver driver;
	
	@FindBy(id="input-username")
	WebElement userElement ;	
	
	@FindBy(id="input-password")
	WebElement passwordElement ;
	
	@FindBy(css=".btn-primary")
	WebElement submitEle ;
	
	
	
	public void login(String username,String password) {
		
		userElement.sendKeys(username);
		passwordElement.sendKeys(password);
		submitEle.click();
		
	}
}

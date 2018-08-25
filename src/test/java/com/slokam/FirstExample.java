package com.slokam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstExample {

	
	
	public static void main(String[] args) {
		// Set the chromedriver.exe path by using webdriver.chrome.driver
		System.setProperty("webdriver.gecko.driver", "D:\\softwares\\jars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// launch the url 
		driver.get("http://localhost:8080");
		
		//Identify the element
		WebElement ele = driver.findElementByXPath("//a[@class='btn btn-success']");
		
		//Perform click operation
		ele.click();
		
		//Type username
		WebElement  usernameEle =driver.findElementByName("username");
		usernameEle.sendKeys("admin");
		
		//Type Password
		WebElement  passwordnameEle =driver.findElementByName("password");
		passwordnameEle.sendKeys("admin");
		
		//Click on Login Button
		driver.findElementByXPath("//input[@value ='Login']").click();
		
		//Get Logout element
		WebElement logoutEle = driver.findElementByXPath("//a[@title='Logout']");
		
		
		//Compare
		String actualValue = logoutEle.getText();
		String expectedValue = "logout";
		System.out.println(actualValue);
		System.out.println(expectedValue);
		
		//Logout from application.
		logoutEle.click();
		
		//driver.close();
		driver.quit();
		
		
	}
}

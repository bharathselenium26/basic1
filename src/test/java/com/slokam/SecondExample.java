package com.slokam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondExample {

	public static void main(String[] args) {
		// Set the chromedriver.exe path by using webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// launch the url
		driver.get("http://localhost:8080");

		
		WebElement newElement = driver.findElementByXPath("//button[@class='btn btn-info']");
		newElement.click();
		
		driver.findElementById("username").sendKeys("bharath");
		driver.findElementByName("email").sendKeys("bharath@gmail.com");
		driver.findElementById("name").sendKeys("bharath");
		driver.findElementById("uiPassword").sendKeys("bharath");
		driver.findElementById("verifyPassword").sendKeys("bharath123");
		
		driver.findElementByXPath("//input[@value='Create User']").click();
		
		WebElement ele = driver.findElementByXPath("//input[@id='verifyPassword']//following-sibling::label");
		String errorMessage = ele.getText();
		System.out.println(errorMessage);
		
		WebElement errorEle = driver.findElementByXPath("//label[text()='Verify Password']//parent::div");
		String errorCss = errorEle.getAttribute("class");
		System.out.println(errorCss);
		
		driver.quit();
		
	}
}

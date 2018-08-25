package com.slokam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdExample {
	   ChromeDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8080");
	}

	public void verifyLoginUser() {
		launchBrowser();
		// Identify the element
		WebElement ele = driver.findElementByXPath("//a[@class='btn btn-success']");

		// Perform click operation
		ele.click();

		// Type username
		WebElement usernameEle = driver.findElementByName("username");
		usernameEle.sendKeys("admin");

		// Type Password
		WebElement passwordnameEle = driver.findElementByName("password");
		passwordnameEle.sendKeys("admin");

		// Click on Login Button
		driver.findElementByXPath("//input[@value ='Login']").click();

		// Get Logout element
		WebElement logoutEle = driver.findElementByXPath("//a[@title='Logout']");

		// Compare
		String actualValue = logoutEle.getText();
		String expectedValue = "logout";
		System.out.println(actualValue);
		System.out.println(expectedValue);

		// Logout from application.
		logoutEle.click();

		// driver.close();
		driver.quit();
	}

	public void verifyCreateUserWithWrongPassword() {
		launchBrowser();

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

	public static void main(String[] args) {
		ThirdExample te = new ThirdExample();
		te.verifyCreateUserWithWrongPassword();
		te.verifyLoginUser();
	}
}

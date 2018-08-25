package com.slokam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FifthExample {

	
	public static void main(String[] args) {
		WebDriver driver = null;
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			 driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\softwares\\jars\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8080");
		
		WebElement ele =	driver.findElement(By.name("//a[@class='btn btn-success']"));
		//Perform click operation
		ele.click();
		
		//Type username
		WebElement  usernameEle =driver.findElement(By.name("username"));
		usernameEle.sendKeys("admin");
		
		//Type Password
		WebElement  passwordnameEle =driver.findElement(By.name("password"));
		passwordnameEle.sendKeys("admin");
		
		//Click on Login Button
		driver.findElement(By.xpath("//input[@value ='Login']")).click();
		
		//Get Logout element
		WebElement logoutEle = driver.findElement(By.xpath("//a[@title='Logout']"));
		
		
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

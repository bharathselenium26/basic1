package com.slokam;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FourthExample {
	
	ChromeDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8080");
	}

	public void clickOnReturningUser() {
		driver.findElementByXPath("//a[@class='btn btn-success']").click();
	}
	
	public void login() {
		driver.findElementByName("username").sendKeys("admin");
		driver.findElementByName("password").sendKeys("admin");
		driver.findElementByXPath("//input[@value ='Login']").click();
	}
	
	public void clickOnFindOwners() {
		driver.findElementByXPath("//a[@href='/owners/find.html']").click();
	}
	
	public void findOwner(String owner) {
		driver.findElementByName("lastName").sendKeys(owner);
		driver.findElementByXPath("//button[text()='Find Owner']").click();
	}
	
	public String getOwnerName() {
		String name = driver.findElementByXPath("//table[@id='owners']/tbody/tr[1]/td[2]/a").getText();
		return name;
	}
	
	public String getAddress() {
		String address = driver.findElementByXPath("//table[@id='owners']/tbody/tr[1]/td[3]").getText();
		return address;
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	public void verifyOwnersName_Positive() {
		launchBrowser();
		clickOnReturningUser();
		login();
		clickOnFindOwners();
		findOwner("Davis");
		System.out.println(getOwnerName());
		System.out.println(getAddress());
		//closeBrowser();
		selectEntry();
	}
	
	
	public void tests2() {
		
		List<WebElement> ele = driver.findElementsByXPath("//a");
	
	}
	public void verifyOwnersName_Neg() {
		launchBrowser();
		clickOnReturningUser();
		login();
		clickOnFindOwners();
		findOwner("Bharath");
		//closeBrowser();
	}
	
	public void selectEntry() {
		//Get Select Element
		WebElement ele1 = driver.findElementByName("owners_length");
		Select selectOwnerLength = new Select(ele1);
		
		String defalutValue = selectOwnerLength.getFirstSelectedOption().getText();
		System.out.println(defalutValue);
		//Select one option
		selectOwnerLength.selectByValue("25");
		
		String value = selectOwnerLength.getFirstSelectedOption().getText();
		System.out.println(value);
		List<WebElement> options = selectOwnerLength.getOptions();
		
		for(int i = 0; i<options.size();i++) {
			WebElement optionEle = options.get(i);
			String optionValue = optionEle.getText();
			System.out.println(optionValue);
		}
		
	}
	
	public static void main(String[] args) {
		FourthExample ex = new FourthExample();
		ex.verifyOwnersName_Neg();
		ex.verifyOwnersName_Positive();
				
	}
	
}

package com.slokam;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Gov {

	WebDriver driver;
	String url = "https://www.india.gov.in";
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@Test
	public void test1() {
		launchBrowser();
		//By.xpath("//a[@class='twoyears-close-btn']");
		//By.className("twoyears-close-btn");
		WebElement ele  = driver.findElement(By.cssSelector(".twoyears-close-btn"));
		
		String mainHandle = driver.getWindowHandle();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		ele = wait.until(ExpectedConditions.visibilityOf(ele));
		
		
		if(ele.isDisplayed()) {
			ele.click();
		}else {
			System.out.println("Element is not visible");
			Assert.fail();
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'Birth Certificate')]")).click();
		
		driver.findElement(By.cssSelector("a.gs-title")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		String handle = "";
		for(String win : windows) {
			System.out.println(win);
			if(!win.equals(mainHandle)) {
				handle = win;
			}
		}
		
		
		driver.switchTo().window(handle);
		
		String st = driver.findElement(By.cssSelector("h2.pane-title")).getText();
		
		System.out.println(st);
	}
}

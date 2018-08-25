package com.slokam;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TSRTC {


	WebDriver driver;
	String url = "http://www.tsrtconline.in/oprs-web/";
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	@Test
	public void testNumberofbuses() {
		launchBrowser();
		driver.findElement(By.id("fromPlaceName")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//a[text()='HYDERABAD']")).click();
		driver.findElement(By.id("toPlaceName")).sendKeys("bengaluru");
		driver.findElement(By.xpath("//a[text()='BENGALURU']")).click();
		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-current-day')]/following::td/a")).click();
		driver.findElement(By.id("searchBtn")).click();
		List<WebElement> buses = driver.findElements(By.xpath("//div[@class='rSetForward']"));
		System.out.println("Total number of buses : " + buses.size() );
	}
}

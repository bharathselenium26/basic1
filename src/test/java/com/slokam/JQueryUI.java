package com.slokam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JQueryUI {

	WebDriver driver;
	String url = "https://jqueryui.com";

	public void launchBrowser(String browser) {

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\softwares\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\softwares\\jars\\IEDriver.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}

	@Test
	public void testDrag() {
		launchBrowser("chrome");
		clickDroppable();
		dragRectangle();
	}

	public void dragRectangle() {
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameElement);
		String beforeText = driver.findElement(By.xpath("//div[@id='droppable']")).getText();
		System.out.println(beforeText);
		
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(draggable,droppable).build().perform();
		
		String afterText = driver.findElement(By.xpath("//div[@id='droppable']")).getText();
		System.out.println(afterText);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Selectable']")).click();
	}

	public void clickDroppable() {
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();

	}

}

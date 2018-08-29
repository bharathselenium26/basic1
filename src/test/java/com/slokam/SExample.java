package com.slokam;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SExample {

	WebDriver driver;
	String url = "https://demo.opencart.com";
	
	@BeforeClass
	public void init() {
		launchBrowser(Browser.CHROME);
	}
	
	public void launchBrowser(Browser browser) {
		
		switch (browser) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "D:\\softwares\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case IE:
			System.setProperty("webdriver.ie.driver", "D:\\softwares\\jars\\IEDriver.exe");
			driver = new InternetExplorerDriver();
			break;
		default:
			break;
		}
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@Test
	public void validateProductOrder() {
		
		
		TakesScreenshot tdriver = (TakesScreenshot) driver;
		
		File source = tdriver.getScreenshotAs(OutputType.FILE);
		
		File targetFile = new File("D://s.jpeg");
		
		try {
			FileUtils.copyFile(source, targetFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.slokam.opencart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.slokam.opencart.pages.AdminDashboardPage;
import com.slokam.opencart.pages.AdminLoginPage;

public class TestOpencart {

	
	WebDriver driver;
	String url = "https://192.168.0.14/opencart/admin/";

	@BeforeMethod
	public void launchBrowser() {
		String browser = "chrome";
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

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	@Test
	public void verifyCreds() {
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login("user", "bhavya");
		AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
		adminDashboardPage.logout();
	}

}

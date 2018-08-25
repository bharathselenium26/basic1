package com.slokam.opencart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.slokam.opencart.pages.AdminDashboardPage;
import com.slokam.opencart.pfpages.AdminLoginPagePF;

public class TestOpencartPF {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	@BeforeClass
	public void init() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}
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
		ExtentTest test = extent.createTest("verifyCreds");
		test.info("Starting step");
		
		AdminLoginPagePF adminLoginPage = 
				PageFactory.initElements(driver, AdminLoginPagePF.class) ;
		adminLoginPage.login("user", "bhavya");
		test.pass("Step1 passed");
		AdminDashboardPage adminDashboardPage = new AdminDashboardPage(driver);
		adminDashboardPage.logout();
		test.fail("sample");
		
	}
	
	
	@AfterClass
	public void complete() {
		extent.flush();
		
	}

}

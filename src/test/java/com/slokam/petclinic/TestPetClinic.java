package com.slokam.petclinic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.slokam.petclinic.pages.LoginPage;
import com.slokam.petclinic.pages.WelcomePage;

public class TestPetClinic {

	WebDriver driver;
	String url = "https://localhost:8080";

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
	public void testFindOwner() {
		
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.clickReturningUser();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("admin", "admin");
		
	}

	/*@Test
	public void testListVeterinarians() {
		login("admin", "admin");
		listVets();
		String message = getVetMessage();
		System.out.println(message);
		logout();
	}*/

	/*public String getVetMessage() {
		String message = driver.findElement(By.id("vetsTable_info")).getText();

		return message;
	}

	public void listVets() {
		driver.findElement(By.xpath("//a[@href='/vets/list.html']")).click();
	}

	public void searchOwner(String owner) {
		driver.findElement(By.id("lastName")).sendKeys(owner);
		driver.findElement(By.cssSelector(".btn-success")).click();
	}

	public void clickFindOwners() {
		driver.findElement(By.xpath("//a[@href='owners/find.html']")).click();
	}

	public void logout() {
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
	}*/

	

}

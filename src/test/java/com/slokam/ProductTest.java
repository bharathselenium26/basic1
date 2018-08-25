package com.slokam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ProductTest {

	
	WebDriver driver;
	String url = "https://demo.opencart.com";
	
	public void launchBrowser(String browser) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\softwares\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\softwares\\jars\\IEDriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@Test
	public void validateProductOrder() {
		launchBrowser("chrome");
		
		WebElement component = driver.findElement(By.xpath("//a[text()='Components']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(component).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Monitors (2)']")).click();
		
		List<String> products = getProductNamesList();
		System.out.println(products.size());
	}
	
	
	public List<String> getProductNamesList() {
		
		List<WebElement> elements = driver.findElements(By.xpath("//h4/a"));
		List<String> productsList= new ArrayList<String>();
		for(int i =0 ;i<elements.size();i++) {
			WebElement element = elements.get(i);
			String productName = element.getText();
			System.out.println(productName);
			productsList.add(productName);
		}
		
		return productsList;
	}
	
	
	
}

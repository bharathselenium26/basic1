package com.slokam;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class B {

	public void bmeth() {
		System.out.println("Started bmeth execution at " + System.currentTimeMillis());
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			String hubUrl = "http://localhost:4444/wd/hub";
	 		DesiredCapabilities cap = DesiredCapabilities.chrome();
	 		URL url=null;
			try {
				url = new URL(hubUrl);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		WebDriver 	driver = new RemoteWebDriver(url, cap);
	 
			driver.get("https://facebook.com");
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed bmeth execution at " + System.currentTimeMillis());
	}
	
	public void dmeth() {
		System.out.println("Started dmeth execution at " + System.currentTimeMillis());
		try {
			String hubUrl = "http://localhost:4444/wd/hub";
	 		DesiredCapabilities cap = DesiredCapabilities.chrome();
	 		URL url=null;
			try {
				url = new URL(hubUrl);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 		WebDriver 	driver = new RemoteWebDriver(url, cap);
	 
			driver.get("https://google.com");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed dmeth execution at " + System.currentTimeMillis());
	}
	
}

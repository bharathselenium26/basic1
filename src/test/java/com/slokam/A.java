package com.slokam;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class A {

	public void ameth() {
		System.out.println("Started ameth execution at " + System.currentTimeMillis());
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
	 
			driver.get("http://toolsqa.com/selenium-webdriver/selenium-grid-how-to-easily-setup-a-hub-and-node/");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed ameth execution at " + System.currentTimeMillis());
	}
	
	public void cmeth() {
		System.out.println("Started cmeth execution at " + System.currentTimeMillis());
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
	 
			driver.get("https://seleniumhq.github.io/docs/grid.html#step_2_start_the_nodes");
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed cmeth execution at " + System.currentTimeMillis());
	}
	
}

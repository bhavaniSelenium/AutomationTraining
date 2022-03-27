package com.sdet.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver;
	String filePath = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
	
//	@BeforeMethod
//	public void launchBrowser() {
//		System.setProperty("webdriver.chrome.driver", filePath);
//		driver = new ChromeDriver();
//		
//	}
//	@AfterMethod
//	public void closeBrowser() {
//		driver.quit(); 
//	}

}

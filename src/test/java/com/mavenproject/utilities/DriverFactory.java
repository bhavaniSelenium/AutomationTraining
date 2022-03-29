package com.mavenproject.utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Optional;
import org.testng.annotations.Optional;

public class DriverFactory {

	
	private static WebDriver driver;
	
	// String filepath = System.getProperty("user.dir");
	
	
	//public static WebDriver createDriver(String browser) throws IOException
	
	
	public static WebDriver createDriver(@Optional("chrome") String browser) throws IOException {
	
	{
		
		switch(browser){

		case "chrome":

		System.setProperty("wedriver.chrome.driver",  "/Drivers/chromedriver");
		driver =  new ChromeDriver();
		break;


		case "firefox":

		System.getProperty("webdriver.gecko.driver",   "/Drivers/geckodriver");
		driver = new FirefoxDriver();
		break;

		default:
			
			throw new IllegalArgumentException("invalid browser type :"   +browser);

		}
	
		
		return driver ;
		
		
	}
	
	
	
	}

}









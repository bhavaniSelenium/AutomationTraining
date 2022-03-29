package com.mavenproject.base;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.mavenproject.utilities.DriverFactory;


public class BaseTest {
	

	
	public WebDriver driver;
	

	String filepath = System.getProperty("user.dir");
	
	
	
	
//	public void launchbrowser()
//	{
//
//
//		System.setProperty("webdriver.chrome.driver", filepath+"/Drivers/chromedriver");
//		
//	 	System.setProperty("webdriver.chrome.driver", "/Users/srinealmaturu/eclipse-workspace/mavenproject/Drivers/chromedriver");
//		
//		driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//	
//	}

	@BeforeMethod
	@Parameters({"browser"})
	public void launchbrowser(String browser) throws IOException
	
	{
		
		
		driver = DriverFactory.createDriver(browser);
		
		driver.manage().window().maximize();
		
		
		
	}
	

	
}














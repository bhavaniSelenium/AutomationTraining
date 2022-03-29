package com.mavenproject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoneyControlHomePage {
	
	public WebDriver driver;
	

	private static final By EMAIL_NAME = By.xpath("//a[@class='userlink']");

	public MoneyControlHomePage(WebDriver driver) {

		this.driver = driver;
	}
	
	public String verifyEmail()
	{
		String mailid = driver.findElement(EMAIL_NAME).getAttribute("title");
		return mailid;
		
		
	}
	
}

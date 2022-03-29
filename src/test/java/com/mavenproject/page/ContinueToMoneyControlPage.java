package com.mavenproject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContinueToMoneyControlPage {

	
	public static WebDriver driver;
	
	


	public ContinueToMoneyControlPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}



	
	public void clickOnMoneyControl()
	{
		try
		{
			
			driver.findElement(By.linkText("moneycontrol.com")).click();
		}catch(Exception e)
		
		{
			System.out.println(e);
			
		}
	}

	
}

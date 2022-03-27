package com.sdet.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContinueToMoneyControlPage {

	public WebDriver driver;
	public ContinueToMoneyControlPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnContinueToMoneyControl() {
		try {
			driver.findElement(By.linkText("moneycontrol.com")).click();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}



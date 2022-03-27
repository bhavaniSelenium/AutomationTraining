package com.sdet.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sdet.page.MoneyControlHomePage;

public class WebElementAction {
	
	WebDriver driver;
	public WebElementAction(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click(By by) {
		WebElement element = driver.findElement(by);
		element.click();
	}
	
	public void sendKeys(By by, String value) {
		WebElement element = driver.findElement(by);
		element.sendKeys(value);
	}
	public String getText(By by) {
		WebElement element = driver.findElement(by);
		String value = element.getText();
		return value;
	}
	public void moveToElement(WebDriver driver, WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	//GetAttribute
	// MoveElement

}

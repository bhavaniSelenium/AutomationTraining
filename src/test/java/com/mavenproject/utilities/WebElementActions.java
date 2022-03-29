package com.mavenproject.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebElementActions {

	static WebDriver driver;
	
	public WebElementActions(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	
	public void click (By by) 
	
	{
		WebElement element = driver.findElement(by);
		element.click();
		
	}
	
	
	public void sendKeys(By by, String value)
	{
		WebElement element = driver.findElement(by);
		element.sendKeys(value);
		
	}
	
	public String getText(By by)
	{
		WebElement element = driver.findElement(by);
		String value = element.getText();
		return value ;
		
	}
	
	
	
	public void moveToElement(WebDriver driver, WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	
	public void getAttribute(By by, String value)
	
	{
		
		WebElement element =  driver.findElement(by);
		
		element.getAttribute(value);
	}



	public boolean displayed(By displayed)
	{
		WebElement element = driver.findElement(displayed);
		return element.isDisplayed();
		
	}
	
	
	public void moveToElement1(WebDriver driver, WebElement element)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}



	
	
	
public int getSize(By by)
	
	{
		
		List <WebElement> element = driver.findElements(by);
		return element.size();
		
	}
	

	
	
	
}

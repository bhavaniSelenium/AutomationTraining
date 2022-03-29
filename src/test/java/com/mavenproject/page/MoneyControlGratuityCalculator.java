package com.mavenproject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mavenproject.utilities.WebElementActions;

public class MoneyControlGratuityCalculator {
	
	public WebDriver driver;
	WebElementActions webElementAction;
	
	private static final By YES_BUTTON = By.xpath("//span[@class ='rdbx openblock']/span");
	private static final By MONTH_SALARY = By.xpath("//input[@id='salary']");
	private static final By YEARS_BUTTON = By.xpath("//input[@id='year']");
	private static final By MONTHS_BUTTON = By.xpath("//input[@id='month']");
	private static final By SUBMIT_BUTTON = By.xpath("//a[@id ='graduity_calc_btn']");
	// private static final By RESET_BUTTON = By.xpath("//a[@id ='reset_btn']");
	
	private static final By DISPLAY_AMOUNT = By.xpath("//span[@id='graduity_amt']");
	
	
	
	public MoneyControlGratuityCalculator(WebDriver driver)
	{
		this.driver = driver;
		webElementAction = new WebElementActions(driver);
		

	}
	
	
	
	public void navigateToGratuity()
	{
		
		driver.get("https://www.moneycontrol.com/personal-finance/tools/gratuity-calculator.html");
		
		
		
	}
	
	
	public void GratuityCalculator()
	{
		
		webElementAction.click(YES_BUTTON);
		webElementAction.click(MONTH_SALARY);
		webElementAction.sendKeys(MONTH_SALARY, "500000");
		webElementAction.click(YEARS_BUTTON);
		webElementAction.sendKeys(YEARS_BUTTON, "6");
		webElementAction.click(MONTHS_BUTTON);
		webElementAction.sendKeys(MONTHS_BUTTON, "5");
		webElementAction.click(SUBMIT_BUTTON);
		String result = webElementAction.getText(DISPLAY_AMOUNT);
		System.out.println("gratuity amount is " +result);
		
	}
	
	
}

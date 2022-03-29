package com.mavenproject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mavenproject.utilities.WebElementActions;

public class MoneyControlPfCalculator {

	public WebDriver driver;

	WebElementActions webElementAction;

	private static final By AGE = By.id("id_your_age");

	private static final By BASIC_SALARY = By.xpath("//input[@name ='basic_salary_monthly']");

	private static final By CONTRIBUTION_TOEPF = By.xpath("//input[@name= 'your_contribution']");

	private static final By EMPLOYER_EPF = By.xpath("//input[@name= 'employers_contribuion']");

	private static final By ANNUAL_INCREASE_SALARY = By.xpath("//input[@name= 'annual_increase_in_salary']");

	private static final By INTEND_TO_RETIRE = By.xpath("//input[@name= 'intend_to_retire']");

	private static final By CURRENT_EPF_BALANCE = By.xpath("//input[@name= 'current_epf_balance']");

	private static final By CURRENT_INTEREST_RATE = By.xpath("//input[@name= 'current_epf_balance']");

	private static final By CALCULATE_BUTTON = By.xpath("//img[@onclick='calculate_epf();']");
	
	
	public MoneyControlPfCalculator(WebDriver driver) {

		webElementAction = new WebElementActions(driver);
		
		this.driver = driver;

	}

	
	
	
	
	public void navigatepfcalculator()

	{

		driver.get("https://www.moneycontrol.com/personal-finance/tools/provident-fund-calculator.html?classic=true");

	}

	public void pfcalculator()

	{

		webElementAction.click(AGE);
		webElementAction.sendKeys(AGE, "25" );
		webElementAction.click(BASIC_SALARY);
		webElementAction.sendKeys(BASIC_SALARY, "60000");
		webElementAction.click(CONTRIBUTION_TOEPF);
		webElementAction.sendKeys(CONTRIBUTION_TOEPF, "10");
		webElementAction.click(EMPLOYER_EPF);
		webElementAction.sendKeys(EMPLOYER_EPF, "25");
		
		webElementAction.click(ANNUAL_INCREASE_SALARY);
		webElementAction.sendKeys(ANNUAL_INCREASE_SALARY, "20000");
		webElementAction.click(INTEND_TO_RETIRE);
		webElementAction.sendKeys(INTEND_TO_RETIRE, "60");
		webElementAction.click(CURRENT_EPF_BALANCE);
		webElementAction.sendKeys(CURRENT_EPF_BALANCE, "25000");
		webElementAction.click(CURRENT_INTEREST_RATE);
		webElementAction.sendKeys(CURRENT_INTEREST_RATE , "10");
		webElementAction.click(CALCULATE_BUTTON);
		

		
	}

}

package com.mavenproject.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenproject.utilities.WebElementActions;

public class MoneyControlMutualFunds {

	WebDriver driver;
	
	WebElementActions webElementAction;
	
	
	//private static final By MUTUALFUNDS_LINK = By.xpath("//li[@class ='menu_l1 active sub_nav']//child::a[@title='Mutual Funds']");
	
	@FindBy(xpath = "//li[@class='menu_l1  sub_nav'][3]//child::a[@title='Mutual Funds']")
	WebElement MutualFundslink;
	
	
	private static final By PERFORMINGCATEGORY_LINK = By.xpath("//a[@title='Top Performing Categories']");
	
	private static final By LARGECAPFUND_LINK = By.xpath("(//a[contains(text(), 'Equity: Large Cap Fund')])[1]");
	
	
	//private static final By NUMBEROFROWS_COUNT = By.xpath("//tr[@class='odd' or @class='even']");
	
	
	private static final By FIRSTWEEK_VALUES = By.xpath("//table/tbody/tr/td[6]");
	
	
	
	public MoneyControlMutualFunds(WebDriver driver)
	{
		this.driver=driver;

		
		webElementAction = new WebElementActions(driver);
		 PageFactory.initElements(driver, this);
		
	}
	
	
	public void launchmoneycontrol()
	{
		
		driver.get("https://www.moneycontrol.com/");
		
	}
	
	
	
	
	public void mutualfunds()
	
	{
		
		webElementAction.moveToElement1(driver, MutualFundslink);
		
		webElementAction.click(PERFORMINGCATEGORY_LINK);
		
		webElementAction.click(LARGECAPFUND_LINK);
		
		
//		int count = webElementAction.getSize(NUMBEROFROWS_COUNT);
//		System.out.println("number of rows" +count);
		
		

		int count1 = webElementAction.getSize(FIRSTWEEK_VALUES);
		
		System.out.println("number of rows" +count1);
		
		
		for(int i=1; i<count1; i++)
			
		{
			
			
//			WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
//
//			wait.until(ExpectedConditions.visibilityOfElementLocated('write locator')]")))
			
			
			
			String values = driver.findElement(By.xpath("(//table/tbody/tr/td[6])["+ i + "]")).getText().replace("%", "");
			//System.out.println(values);
		
			float f = Float.parseFloat(values);
			
			
			
			//System.out.println("float values " + Float.parseFloat(values));
			
			
			if((Float.parseFloat(values) > 0) && (Float.parseFloat(values)< 2))
			{
				
				System.out.println(values);
			}
			
				
			//System.out.println("float values" +Float.parseFloat(values.substring(1, values.length() - 1)) + "" + values.charAt(values.length() - 1));
				
				
	
			
	}
			
		
			
			
		}
		

		
	}
	
	
	
	
	
	
	
	




package com.mavenproject.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.mavenproject.utilities.WebElementActions;


public class MoneyControlCurrencyConverter {

	public static WebDriver driver;
	
	
	@FindBy(xpath = "(//a[@title='Markets'])[1]")
	WebElement market;
	
	
	private static final By CLICKON_CURRENCY = By.xpath("(//a[@title='Currency'])[1]");
	private static final By AMOUNTIN_INDIANRUPEES = By.xpath("//input[@id='rs_input']");
	private static final By SELECT_CURRENCY = By.xpath("//select[@name ='currency']");
	
	private static final By CLICKON_CONVERT = By.xpath("//input[@class ='convertLink']");
	

	
	WebElementActions webelementactions;
	
	public MoneyControlCurrencyConverter(WebDriver driver)
	{
		
		this.driver = driver;
		webelementactions = new WebElementActions(driver);
		 PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	
	public void currency()
	{
		
		
		
		

//		WebElement Market = driver.findElement(By.xpath("(//a[@title='Markets'])[1]"));       //li[@class='menu_l1  sub_nav']/a[@title='Markets']
//				Actions action =  new Actions(driver);  //handle keyboard and mouse actions.
//				
//				action.moveToElement(Market).build().perform();
		
		
		webelementactions.moveToElement(driver, market);
		webelementactions.click(CLICKON_CURRENCY);
				
				
				
				//driver.findElement(By.xpath("(//a[@title='Currency'])[1]")).click();
				
	}
	
	
	public void currencyconverter(String indianRupees, String currencyConvertor )
	{
		
		
		webelementactions.click(AMOUNTIN_INDIANRUPEES);
		webelementactions.sendKeys(AMOUNTIN_INDIANRUPEES, indianRupees );


		
		WebElement dropdown = driver.findElement(SELECT_CURRENCY);
		Select select = new Select(dropdown);
		select.selectByValue(currencyConvertor); 		//can also use byselectvisibletext
		
		 

		webelementactions.click(CLICKON_CONVERT);
		
		//driver.findElement(By.xpath("//input[@class ='convertLink']")).click();
	
		
	}
	
	
	
	
	
	
	
	
	
}

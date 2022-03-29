package com.mavenproject.page;

import java.util.concurrent.TimeUnit;

//import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mavenproject.utilities.WebElementActions;

public class MoneyControlLogin {

	public  WebDriver driver;
	
//	@FindBy(xpath = "//a[@title ='Log In']")
//	WebElement emailTextBox;    //click

	
	
	@FindBy(linkText = "Hello, Login")
	WebElement helloLogin;
	
//	private static final By HELLO_LOGIN = By.linkText("Hello, Login"); //golbal declaration of webelement another way of representation
	
	private static final By LOGIN_BUTTON = By.xpath("//a[@title ='Log In']");

	private static final By EMAIL_TEXTBOX = By.xpath("(//input[@id='email'])[2]");
	
	private static final By PASSWORD_TEXTBOX = By.xpath("(//input[@id='pwd'])[2]"); // another way of representation
	
	private static final By LOGIN_SUBMIT = By.id("ACCT_LOGIN_SUBMIT");
	
	
	
	
	
	WebElementActions webElementAction; 


	public MoneyControlLogin(WebDriver driver)  // Constructor 
	
	{
		
	 this.driver = driver;
	//this.properties = properties;
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	 webElementAction = new WebElementActions(driver);
	 PageFactory.initElements(driver, this);

	}
	

	
	
	public void navigateToMoneyControl()
	{
		
		driver.get("https://www.moneycontrol.com/");
		

	}

	
	public void hellologin()
	{
		
//		WebElement hellologin= driver.findElement(By.linkText("Hello, Login"));
//		
//		Actions action = new Actions(driver);
//		
//		action.moveToElement(hellologin).build().perform();
	
		
		webElementAction.moveToElement(driver, helloLogin);
		
	}
	
	
	
	
	public void loginpage(String username , String password)
	{
		
		//driver.findElement(By.xpath("//a[@title ='Log In']")).click();  //click on login button
		
		
		
		
		
		
		webElementAction.click(LOGIN_BUTTON);

		
		driver.switchTo().frame("myframe");    							//Switch to Frames
	
		
		webElementAction.click(EMAIL_TEXTBOX);
		webElementAction.sendKeys(EMAIL_TEXTBOX, username);
		webElementAction.click(PASSWORD_TEXTBOX);
		webElementAction.sendKeys(PASSWORD_TEXTBOX, password);
		webElementAction.click(LOGIN_SUBMIT);

	
//		driver.findElement(By.xpath("(//input[@id='email'])[2]")).click();
//		
//		
//		driver.findElement(By.xpath("(//input[@id='email'])[2]")).sendKeys(username);
//		
//		
//		driver.findElement(By.xpath("(//input[@id='pwd'])[2]")).click();
//		
//		driver.findElement(By.xpath("(//input[@id='pwd'])[2]")).sendKeys(password);
//		
//		driver.findElement(By.id("ACCT_LOGIN_SUBMIT")).click();
		


	} 
	
	
	
	
	
}

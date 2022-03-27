package com.sdet.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sdet.utility.WebElementAction;

public class MoneyControlLogin {
//	WebElement helloLogin = driver.findElement(By.linkText("Hello, Login"));
//	WebElement emailTextBox = driver.findElement(By.xpath("(//input[@id='email'])[2]"));
//	
	@FindBy(linkText = "Hello, Login")
	WebElement helloLogin;
	
	@FindBy(xpath = "(//input[@id='email'])[2]")
	WebElement emailTextBox1; // click
	
	
	@FindBy(xpath = "(//input[@id='pwd'])[2]")
	WebElement passwordTextBox;
	
	@FindBy(how = How.XPATH, using = "(//input[@id='pwd'])[2]" )
	WebElement passWebElement1;
	
	private static final By PASSWORD_TEXTBOX = By.xpath("//input[@id='pwd']"); 
	
	public static WebDriver driver;
	WebElementAction webElementAction = new WebElementAction(driver); 
	public MoneyControlLogin(WebDriver driver) { //
		this.driver = driver;
		this.webElementAction = new WebElementAction(driver); 
		PageFactory.initElements(driver, this);
	}
	
	// we have pass the driver from baseTest bcz the driver initialized from base.
	//To call methods from a class we need to create a object
	
	public void navigateToMoneyControl() {
		driver.get("https://www.moneycontrol.com/");
		
	}
	
	public void login() {
	    webElementAction.moveToElement(driver, helloLogin);
		driver.findElement(By.linkText("Log-in")).click();
		driver.switchTo().frame("myframe");
		webElementAction.click(PASSWORD_TEXTBOX);
		emailTextBox1.sendKeys("bhavani.011@gmail.com");
		webElementAction.click(PASSWORD_TEXTBOX);
		webElementAction.sendKeys(PASSWORD_TEXTBOX, "qwer@123#Qwer");
		webElementAction.click(PASSWORD_TEXTBOX);
	}
}


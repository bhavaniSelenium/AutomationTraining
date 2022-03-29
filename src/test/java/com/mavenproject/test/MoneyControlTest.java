package com.mavenproject.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mavenproject.base.BaseTest;
import com.mavenproject.page.ContinueToMoneyControlPage;
import com.mavenproject.page.MoneyControlCurrencyConverter;
import com.mavenproject.page.MoneyControlGratuityCalculator;
import com.mavenproject.page.MoneyControlHomePage;
import com.mavenproject.page.MoneyControlLogin;
import com.mavenproject.page.MoneyControlMutualFunds;
import com.mavenproject.page.MoneyControlPfCalculator;
import com.mavenproject.utilities.PropertyReader;

public class MoneyControlTest extends BaseTest

{
	

	String filepath = "/Users/srinealmaturu/eclipse-workspace/mavenproject/config.properties";
	
	PropertyReader propertyreader = new PropertyReader(filepath); 
	
	
	
	
	

	@Test
	public void validlogin() throws IOException 
	
	
	{


 		MoneyControlLogin login = new MoneyControlLogin(driver);
	
		login.navigateToMoneyControl();
		
		ContinueToMoneyControlPage control = new ContinueToMoneyControlPage(driver);
		control.clickOnMoneyControl();
		
		
		login.hellologin(); 
		
		login.loginpage(propertyreader.read("username"), propertyreader.read("password"));
		
		MoneyControlHomePage homePage = new MoneyControlHomePage(driver);
		String mailid = homePage.verifyEmail().trim(); 
		Assert.assertEquals(mailid, propertyreader.read("username"));
		System.out.println("Login Successfull");
		
		
		MoneyControlCurrencyConverter currencyConverter = new MoneyControlCurrencyConverter(driver);
		currencyConverter.currency();
		currencyConverter.currencyconverter(propertyreader.read("indianRupees"), "Euro"); //propertyreader.read("indianRupees") is 1000
		
		  

		
	}
	
	

	
	@Test
	
	public void calculatepf()
	
	{
		
		//launchbrowser();
		MoneyControlPfCalculator pfcalculator = new MoneyControlPfCalculator(driver);
		pfcalculator.navigatepfcalculator();
		pfcalculator.pfcalculator();

	}
	
	
	@Test
	public void calculategratuity()
	{
		//launchbrowser();
		MoneyControlGratuityCalculator gratuitycalculator = new MoneyControlGratuityCalculator(driver);
		gratuitycalculator.navigateToGratuity();
		gratuitycalculator.GratuityCalculator();
		

	}
	
		
	
	
	
	
	
	@Test
	
	public void MutualFunds()
	
	{
		//launchbrowser();
		
	
		MoneyControlMutualFunds Mutualfunds = new MoneyControlMutualFunds(driver);
		
		Mutualfunds.launchmoneycontrol();
		

		ContinueToMoneyControlPage control = new ContinueToMoneyControlPage(driver);
		control.clickOnMoneyControl();
		
		Mutualfunds.mutualfunds();
		
		 
	} 
	
	
	
	
	
	
	
	
	
	
	
	
}




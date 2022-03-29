package com.sdet.test;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sdet.base.BaseTest;
import com.sdet.page.ContinueToMoneyControlPage;
import com.sdet.page.MoneyControlLogin;

public class MoneyControlTest extends BaseTest{
	@BeforeClass
	public void createuser() { //it 
	}
	
	@BeforeMethod
	public void setup() {
		
	}
	
//	@DataProvider(name = "dp")
//	public Object[][] dataProvider(){
//		return new Object[][] {{properties.get,25},{"Sushmitha",24},{"manasa",23}};
//	}

	@Test(groups = {"Regression"}, dataProvider  = "dp", dataProviderClass = BaseTest.class)
	public void dataproviderTest(String names, int age) {
		System.out.println(names);
		System.out.println(age);
	}
	
	
	@Test
	public void login() {
		MoneyControlLogin login = new MoneyControlLogin(driver);
		login.navigateToMoneyControl(); // enter url
		ContinueToMoneyControlPage continueToMoneyControlPage = new ContinueToMoneyControlPage(driver);
		continueToMoneyControlPage.clickOnContinueToMoneyControl(); // click on moneycontrol link
		login.login(); // login
	}
}

// Testcase1: ValidLogin
// TestCase2: invalidLogin
// Testcase3: PFcalculator
package com.sdet.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsExample {

	
public static void main(String[] args) {
	WebDriver driver;
	String filePath = System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", filePath);
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
}
}

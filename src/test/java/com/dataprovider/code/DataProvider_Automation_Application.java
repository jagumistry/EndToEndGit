package com.dataprovider.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Automation_Application {
	public static WebDriver driver;
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {{"sanity Test"}, {"regression Test"}};
		
	}
	@BeforeTest
	public void launchUrl() {
		System.out.println("Notifying test starts");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	}
	@Test (dataProvider = "getData")
	public void dataMetrix(String keyname) {
		WebElement usernametextBox = driver.findElement(By.id("login1"));
		usernametextBox.sendKeys(keyname);
		Reporter.log("The keyname for username is : " + keyname);
		
		WebElement passwordtextBox = driver.findElement(By.id("password"));
		passwordtextBox.sendKeys(keyname);
		Reporter.log("The keyname for password is : " + keyname);
		
	
	
}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}

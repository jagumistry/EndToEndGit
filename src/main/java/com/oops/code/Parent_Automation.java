package com.oops.code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parent_Automation {
	public static WebDriver driver;
	
	@BeforeTest
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMillis(1));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//p[@id = 'signin_info']/a[1]")).click();
		driver.findElement(By.className("signin")).click();
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
		
		
	}

}

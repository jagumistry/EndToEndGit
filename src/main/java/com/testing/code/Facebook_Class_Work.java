package com.testing.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Class_Work {
	
	public static WebDriver driver;
	public static Select select;
	
	@Test
	public void checkDOB() throws Exception {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//div[@id = 'reg_pages_msg']/preceding::a[1]")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.name("firstname")).sendKeys("Jagruti");
	Thread.sleep(1000);
	driver.findElement(By.name("lastname")).sendKeys("Mistry");
	Thread.sleep(1000);
	driver.findElement(By.name("reg_email__")).sendKeys("jag.mistry5@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("jag.mistry5@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.name("reg_passwd__")).sendKeys("Bholu123@");
	Thread.sleep(1000);
	
	select = new Select(driver.findElement(By.id("month")));
	select.selectByVisibleText("Sep");
	
	select = new Select(driver.findElement(By.id("day")));
	select.selectByVisibleText("19");
	
	select = new Select(driver.findElement(By.id("year")));
	select.selectByVisibleText("1991");
	
	driver.findElement(By.xpath("//div[@id = 'birthday_age']/following::div[2]/following::span[1]/child::span[1]/descendant::label")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
	
	
	
	
	
}
}

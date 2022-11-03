package com.oops.code;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Rediff_Login extends Parent_Automation {
	@Test
	public void rediffLoginCredentials() {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();
		
	}
}

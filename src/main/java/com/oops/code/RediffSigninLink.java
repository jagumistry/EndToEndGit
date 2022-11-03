package com.oops.code;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RediffSigninLink extends Parent_Automation {
	
	
	@Test
	public void ClickOnSignLink() {
		//driver.findElement(By.xpath("//p[@id = 'signin_info']/a[1]")).click();
		driver.findElement(By.className("signin")).click();
		
	}

}

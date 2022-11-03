package com.oops.code;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Rediff_logout extends Parent_Automation {
	@Test
	public void redifflogout() {
		driver.findElement(By.className("rd_logout")).click();
		
		
		
	}

}

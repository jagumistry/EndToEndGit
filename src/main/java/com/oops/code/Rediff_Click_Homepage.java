package com.oops.code;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Rediff_Click_Homepage extends Parent_Automation {
	@Test
	public void ClickOnHomepage() {
		driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]")).click();
		
		
	}

}

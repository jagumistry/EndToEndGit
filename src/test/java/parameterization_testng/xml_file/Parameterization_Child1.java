package parameterization_testng.xml_file;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_Child1 extends Parameterization_Perent{
	@Test
	@Parameters({"Browser", "url", "locator"})
	public void clickOnSignin(String Browser, String url, String locator) {
		driver.get(url);//url
		driver.findElement(By.className(locator)).click();//locator
		System.out.println("The title of the login page is :" + driver.getTitle());
		

	}

}

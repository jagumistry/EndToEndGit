package parameterization_testng.xml_file;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_Child3 extends Parameterization_Perent{
	@Test
	@Parameters({"Browser", "url", "password"})
	public void clickOnSignin(String Browser, String url, String password) {
		driver.get(url);//url
		driver.findElement(By.id("password")).sendKeys(password);//password
		System.out.println("The title of the login page is :" + driver.getTitle());
		

	}

}

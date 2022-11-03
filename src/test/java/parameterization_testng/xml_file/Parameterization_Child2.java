package parameterization_testng.xml_file;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_Child2 extends Parameterization_Perent{
	
	@Test
	@Parameters({"Browser", "url", "username"})
	public void clickOnSignin(String Browser, String url, String username) {
		driver.get(url);//url
		driver.findElement(By.id("login1")).sendKeys(username);//username
		System.out.println("The title of the login page is :" + driver.getTitle());
		

	}


}

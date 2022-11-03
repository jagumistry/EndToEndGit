package parameterization_testng.xml_file;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_Child4 extends Parameterization_Perent{
	@Test
	@Parameters({" Browser", "url", "signin"})
	public void clickOnSignin(String Browser, String url, String signin) {
		driver.get("url");//url
		driver.findElement(By.className("signin")).click();//signin
		System.out.println("The title of the login page is :" + driver.getTitle());

}
}
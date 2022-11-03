package parameterization_testng.xml_file;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization1 {
public static WebDriver driver;
	
	@Test
	@Parameters({"Browsre", "url", "locatorSignIn"})
	public void rediffParameterization(String Browser, String url, String locatorSignIn) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();//browser
		driver.manage().window().maximize();
		driver.get(url);//url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMillis(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.className(locatorSignIn)).click();//locatorSignIn
		
		//driver.findElement(By.id("login1")).sendKeys(username);//username
		//driver.findElement(By.id("password")).sendKeys(password);//password
		//driver.findElement(By.className("signinbtn")).click();

}
}
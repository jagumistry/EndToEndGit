package parameterization_testng.xml_file;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {
	public static WebDriver driver;
	
	@Test
	@Parameters({"Browsre", "url", "username", "password"})
	public void rediffParameterization(String Browser, String url, String username, String password) {
		if(Browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(Browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();//browser
		driver.manage().window().maximize();
		driver.get(url);//url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMillis(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys(username);//username
		driver.findElement(By.id("password")).sendKeys(password);//password
		driver.findElement(By.className("signinbtn")).click();
		
		
		
		
	}

}

package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshort {
	
	public static WebDriver driver;
	
	@Test
	public void checkScreenshort() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
		WebElement Logo = driver.findElement(By.cssSelector("div.section.where-to"));
		File source = Logo.getScreenshotAs(OutputType.FILE);
		//File destination = new File("C:\\Users\\Mahil\\eclipse-workspace\\Maven_Project\\test-output\\Screenshorts\\openweathermeplogo.png");
		
		File destination = new File(System.getProperty("user.dir") + "\\test-output\\Screenshorts\\openweathermeplogo1.png");
		
		FileHandler.copy(source, destination);
		
		
		
	}

}

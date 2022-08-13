package Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpaths_Syntex_No5 {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.xpath("//input[contains(@name, 'proceed')]")).click();
		
		//this Syntex working for both (links and button) 
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contains(@class, 'shopicon relative')]")).click();
	

	}

}

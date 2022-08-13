package Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpaths_Syntex_No123 {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@id = 'login1']")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.xpath("//input[@id = 'login1' and @name = 'login']")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.xpath("//input[@id = 'login1' or @name = 'login']")).sendKeys("seleniumpanda@rediffmail.com");
		
		driver.findElement(By.xpath("//input[@name = 'passwd']")).sendKeys("Selenium@123");
		//driver.findElement(By.xpath("//input[@id = 'password' and @name = 'passwd']")).sendKeys("Selenium@123");
		//driver.findElement(By.xpath("//input[@id = 'password' or @name = 'passwd']")).sendKeys("Selenium@123");
		

	}

}

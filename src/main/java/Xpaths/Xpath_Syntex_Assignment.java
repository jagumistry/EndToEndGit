package Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Syntex_Assignment {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.findElement(By.xpath("//input[@id = 'login1' and @name = 'login']")).sendKeys("seleniumpanda@rediffmail.com");
		//driver.findElement(By.xpath("//input[@id = 'password' or @name = 'passwd']")).sendKeys("Selenium@123");
		//driver.findElement(By.xpath("//input[@name = 'remember' or @id = 'remember']")).isSelected();
		//driver.findElement(By.xpath("//input[@name = 'proceed' or @class = 'signinbtn']")).click();
		//driver.findElement(By.xpath("//a[@class = 'rd_logout']")).click();
		
		//driver.get("https://www.rediff.com/");
		//driver.findElement(By.xpath("")).click();
		
		
		
		
		//driver.get("https://www.rediff.com/");
		//driver.findElement(By.xpath("//a[text() = 'Money']")).click();
		//driver.findElement(By.xpath("//a[@class = 'black bold']")).click();
		
		//driver.findElement(By.xpath("//a[@class = 'mailicon']")).click();
		
		//driver.findElement(By.xpath("//a[contains(@class, 'bmailicon relative')]")).click();
		
		//driver.findElement(By.xpath("//a[contains(@class, 'moneyicon relative')]")).getClass();
		
		
		
		
		
		
		
		//driver.get("https://openweathermap.org/");
		//driver.findElement(By.xpath("//div[contains(@id, 'support-dropdown')]")).click();
		
		//driver.get("");
		//driver.findElement(By.xpath("")).click();
		
		
		
		
		

	}

}

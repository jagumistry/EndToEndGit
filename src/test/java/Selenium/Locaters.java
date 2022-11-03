package Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Locaters {
	
    public static WebDriver driver;
    //public static WebDriverWait wait;
    
    public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("http://automationpractice.com/index.php");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class = 'login']")));
		driver.findElement(By.xpath("//a[@class = 'login']")).click();
		
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id = 'email_create']")));
		driver.findElement(By.xpath("//input[@id = 'email_create']")).sendKeys("jag.mistry50@gmail.com");
		
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id = 'SubmitCreate']")));
		driver.findElement(By.xpath("//button[@id = 'SubmitCreate']")).click();
		
		WebElement genderID = driver.findElement(By.xpath("//input[@name = 'id_gender' and @id = 'id_gender1']"));
		
		//above()
		String titleCreatAccount = driver.findElement(with(By.tagName("label")).above(genderID)).getText();
		System.out.println("For locator type above() : " + titleCreatAccount);
		
		//below()
		String FirstNameCreatAccount = driver.findElement(with(By.tagName("label")).below(genderID)).getText();
		System.out.println("For locator type below() : " + FirstNameCreatAccount);
		
		//switched to rediff login page
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi?mobilelogin=1");
		
		//toLeftof()
		WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id = 'password']"));
		String passwordText = driver.findElement(with(By.tagName("p")).toLeftOf(passwordTextBox)).getText();
		System.out.println("Text beside the password TextBox is :" + passwordText);
		
		//toRightof()
		WebElement rediffdotcomLink = driver.findElement(By.xpath("//a[@class = 'f12']"));
		String usernameText = driver.findElement(with(By.tagName("p")).toRightOf(rediffdotcomLink)).getText();
		System.out.println("Text beside the rediffmail logo is :" + usernameText);
		
		//near()
		WebElement rediffmaillogo = driver.findElement(By.xpath("//span[@class = 'red']"));
		String KeepmesignedinText = driver.findElement(with(By.tagName("label")).near(rediffmaillogo)).getText();
		System.out.println("Text near by the rediffmail logo is :" + KeepmesignedinText );
		
	}


}

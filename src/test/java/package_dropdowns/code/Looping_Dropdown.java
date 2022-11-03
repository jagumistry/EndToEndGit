package package_dropdowns.code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Looping_Dropdown {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		String TravellersSelections = driver.findElement(By.xpath("//span[@id = 'spnTraveller']")).getText();
		System.out.println("TravellersSelections");
		driver.findElement(By.xpath("//span[@id = 'spnTraveller']")).click();
		
		int Adult = 1;
		while(Adult < 5) {
			driver.findElement(By.xpath("//input[@name = 'quantity' and @id = 'optAdult']/following::button[@id = 'add'][1]")).click();
			Adult = Adult + 1;
			
		}
		
		int child = 1;
		while(child <= 3 ) {
		driver.findElement(By.xpath("//input[@name = 'quantity1' and @id = 'optChild']/following::button[1]")).click();
		child = child + 1;
	}
		int Infant = 1;
		while(Infant < 4) {
			driver.findElement(By.xpath("//input[@name = 'quantity2' and @id = 'optInfant']/following::button[1]")).click();
			Infant = Infant + 1;	

}
		String PostSelection = driver.findElement(By.xpath("//div[@id = 'myDropdown_n']/preceding::span[1]")).getText();
		System.out.println("Total passengers after booking EMT : " + PostSelection);
		
		driver.findElement(By.xpath("//a[@id = 'traveLer']")).click();
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.spicejet.com/");
		
		String PreSelectionSpiceJet = driver.findElement(By.xpath("//div[contains(text(), '1 Adult')]")).getText();
		System.out.println("Total passengers before booking SJ : " + PreSelectionSpiceJet);
		driver.findElement(By.xpath("//div[contains(text(), '1 Adult')]")).click();
		
		int AdultSpicejet = 1;
		while(AdultSpicejet < 4) {
			driver.findElement(By.xpath("//div[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]")).click();
			AdultSpicejet = AdultSpicejet +1;
		}
		
		int childSpicejet = 1;
		while(childSpicejet <= 3) {
			driver.findElement(By.xpath("//div[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
			childSpicejet = childSpicejet + 1;
		}
		
		int InfantSpicejet = 1;
		while(InfantSpicejet < 3) {
			driver.findElement(By.xpath("//div[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[3]")).click();
			InfantSpicejet = InfantSpicejet + 1;
			}
		
		String PostSelectionSpiceJet = driver.findElement(By.xpath("//*[@id='main-container']/div/div[1]/div[3]/div[2]/div[5]/div[1]/div/div[1]/div[2]/div[1]")).getText();
		System.out.println("Total passengers after booking SJ : " + PostSelectionSpiceJet);

		

}
}


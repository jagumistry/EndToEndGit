package testng.parallel.concept.dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//parallel by Method, and thread count=2 and number of method or testcases also 2

public class TestNG_Parallel_Method {
	public static WebDriver driver;
	
	@Test(priority=1, threadPoolSize=5, invocationCount=5)
	public void testcase1() {
		System.out.println("My TestCase1 is opening in the thread :" + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test(priority=2, threadPoolSize=5, invocationCount=5)
	public void testcase2() {
		System.out.println("My TestCase2 is opening in the thread :" + Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}
	

	//parallel by Method, and thread count=2 and number of method or testcases also 3

	//parallel by Method, and thread count=3 and number of method or testcases also 3
	
	@Test(priority=3)
	public void testcase3() {
		System.out.println("My TestCase3 is opening in the thread :" + Thread.currentThread().getId());

	
	}
	

}

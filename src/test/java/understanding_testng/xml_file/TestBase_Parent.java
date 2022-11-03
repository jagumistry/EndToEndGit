package understanding_testng.xml_file;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase_Parent {
	@BeforeTest
	public void parentmethod() {
		System.out.println("This is BeforeTest Parent Method");
	}
	@AfterTest
	public void tiredown() {
		
	}

}

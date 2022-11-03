package understanding_testng.xml_file;

import org.testng.annotations.Test;

public class Child1 extends TestBase_Parent {
	@Test
	public void Child1Addition() {
		String Child1 = "Hello";
		String Child2 = "World";
		
		System.out.println(Child1 + Child2);
		
	}
	

}

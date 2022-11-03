package understanding_testng.xml_file;

import org.testng.annotations.Test;

public class Child3 extends TestBase_Parent {
	@Test
	public void Child3Addition() {
		String Child1 = "Good";
		String Child2 = "Afternoon";
		
		System.out.println(Child1 + Child2);


}
}
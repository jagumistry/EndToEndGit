package understanding_testng.xml_file;

import org.testng.annotations.Test;

public class Child4 extends TestBase_Parent {
	@Test
	public void Child4Addition() {
		String Child1 = "Good";
		String Child2 = "Evening";
		
		System.out.println(Child1 + Child2);
	}

}

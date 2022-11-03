package understanding_testng.xml_file;

import org.testng.annotations.Test;

public class Child2 extends TestBase_Parent {
		@Test
		public void Child2Addition() {
			String Child1 = "Good";
			String Child2 = "Morning";
			
			System.out.println(Child1 + Child2);

}
}

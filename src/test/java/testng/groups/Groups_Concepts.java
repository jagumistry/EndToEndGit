package testng.groups;

import org.testng.annotations.Test;


@Test(groups="CompleteClassLevelTest")
public class Groups_Concepts {
	@Test(groups = {"window.smoke"})
	public void testcase1() {
		System.out.println("This is testcase1 logic");
	}
	
	@Test(groups = {"smoke", "sanity"})
	public void testcase2() {
		System.out.println("This is testcase2 logic");
	}
	
	@Test(groups = {"smoke", "sanity", "regration"})
	public void testcase3() {
		System.out.println("This is testcase3 logic");
	}
	
	@Test(groups = {"sanity"})
	public void testcase4() {
		System.out.println("This is testcase4 logic");
	}
	
	@Test(groups = {"window.regration"})
	public void testcase5() {
		System.out.println("This is testcase5 logic");
	}


}

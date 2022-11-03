package interfaces_learning;

public class Test_Calss implements Intro, Conclude{
	public static void main(String[] args) {
		Test_Calss tc = new Test_Calss();
		tc.display();
		tc.display1();
		tc.display2();
		tc.tearDown();
		tc.quitBrowser();
		
		
		
	}

	@Override
	public void display() {
		System.out.println("Display in Test");
		
	}

	@Override
	public void display1() {
		System.out.println("Display1 in Test");
		
	}
	
	@Override
	public void display2() {
		System.out.println("Display2 in Test");
		
	}

	@Override
	public void tearDown() {
		System.out.println("tearDown in Test");
		
	}

	@Override
	public void quitBrowser() {
		System.out.println("quitBrowser in Test");
	
	}

}

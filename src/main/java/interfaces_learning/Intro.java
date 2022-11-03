package interfaces_learning;

public interface Intro {
	//can not make body in interfaces class
	//interfaces is fully abstract, no need to write abstract between public and interface
	
	/*public void display();
	 * public abstract void display();
	 * void display();
	 * above all are same, all are correct
	 */
	
	public void display();
	public abstract void display1();
	void display2();
	
	int i = 10;
	public static final int j = 10;
	
	default void turnCase() {
		System.out.println("This is a non static default access modifire method");
	}
	
	public static void jump() {
		System.out.println("This is public static jump method");
	}
	
	public static void main(String[] args) {
		System.out.println("This is the main method");
	}
		
	

}

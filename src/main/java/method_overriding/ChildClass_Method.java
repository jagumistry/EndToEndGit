package method_overriding;

public class ChildClass_Method extends Method_OverRiding {

	public static void main(String[] args) {
		ChildClass_Method cc = new ChildClass_Method();
		cc.initialize();
		cc.cash();
		
		Method_OverRiding parent = new Method_OverRiding();
		parent.initialize();
		
		

	}
	
	public void initialize() {
		System.out.println("This is the child calss init method");
	}
	
	private void cash() {
		System.out.println("This is child class private cash methids");
	}

}

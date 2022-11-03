package abstract_class;

public class Test extends Abstract_Class_Concepts{

	public static void main(String[] args) {
		
		Test t = new Test();
		t.gayab();
		t.MrIndia();
		t.displey();
		t.name = "Automation";
		t.socialMedia = "Youtube";
		
		TestOld to = new TestOld();
		to.displey();
		to.gayab();
		to.MrIndia();
		to.displey();
		to.name = "Pictures";
		to.socialMedia = "Instragram";
		
		System.out.println(t.name + "-->" + t.socialMedia);
		System.out.println(to.name + "-->" + to.socialMedia);
		
		

	}

	@Override
	public void gayab() {
		System.out.println("This is test class gayab method");
	
		
	}

	@Override
	public void MrIndia() {
		System.out.println("This is test class Mr.India method");
	
		
	}

}

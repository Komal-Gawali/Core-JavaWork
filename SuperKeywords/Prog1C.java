package SuperKeywords;

public class Prog1C extends Prog1P {

	int a = 1009;
	public void display() {
		super.display();
		System.out.println("The original price ");
		
	}
	public void show() {
		
		System.out.println("VAlue 1 " + a);
		super.display();
		System.out.println("Value 2 " + super.a);
		
	}
}

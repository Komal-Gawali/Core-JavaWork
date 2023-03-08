package MethodOverriding;

public class ChClass extends PaClass {
    @Override
	public void math(String name) {
		System.out.println("First indian nobel prize holder is " + name);
	}
    
	
	public static void main(String[] args) {
		PaClass c = new ChClass();
		c.math("C. V. Raman");
	}

}

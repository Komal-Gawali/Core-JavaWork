package Staticmethods;

public class Prog2Impl extends Prog2Override2 {
// overriding is not possible because for static method we are't create an object for call the methods
//	so if we want to call the method from super class and that same method are exist in subclass
//	here we are able to call both the methods from super class as well as subclass and this scenario it's look like practically
	public static void main(String[] args) {
		
		m1(12);
		m1(22.2);
		m2(12);
	}

}

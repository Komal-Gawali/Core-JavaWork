package MethodOverriding;

public class ImplimentationClass extends ChildClass {

	public static void main(String[] args) {
		m1();
		ParentClass c = new ChildClass();
		c.method();
		m1();
		m1(222);

	}

}

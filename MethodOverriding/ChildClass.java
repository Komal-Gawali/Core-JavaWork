package MethodOverriding;

public class ChildClass extends ParentClass {

	public void method() {
		System.out.println("But child take disadvantage of it.");
	}
	public static void m1() {
		System.out.println("This is Child Class");
	}
	public static void m1(int a) {
		
		System.out.println("This is overloading of static method. " + a);
	}
}

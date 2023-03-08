package Staticmethods;

public class Prog1OverLoad {

	public static void m1(int a) {
		System.out.println("Answer is " + a);
	}
	public static void m2(int b) {
		System.out.println("Result is " + b);
	}
	public static void m3(int a, int b) {
		System.out.println("Addition is "+  (a+b));
	}
	public static void main(String[]args) {
		m1(56);
		m2(44);
		m3(3, 45);
		
	}
}

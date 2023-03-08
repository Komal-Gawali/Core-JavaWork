package useFinal;

public class Prog_C extends Prog_P {

	public void method1() {
		System.out.println("this is child class");
	}
	public void method2(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Prog_C k = new Prog_C();
		k.method1();
		k.method2();
		k.method2(13);

	}

}

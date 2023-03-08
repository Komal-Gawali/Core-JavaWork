package Inheritance;

public class A { 
	private int a= 15, b =22, c = a+b;
	public static int j = 22;
	public void add()
	{
		System.out.println("Addition is "+ c);
	} 
	static int h = 5;
	
	public static void main(String[] args) {
		A g = new A();
		g.add();
		System.out.println("The value of j = " + j);
		System.out.println("The value of h = " + h);
	}

}

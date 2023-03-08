package StaticBlock;

public class InstanceBlock {

	static int k ;
	InstanceBlock()
	{   
		int e = 12;
		k=43;
		System.out.println("This is constructor.");
		System.out.println(e+k);
	}
	private static void method(){
		int b= 22;
//		k=33;
		System.out.println("This is static method.");
		System.out.println(b);
	}
	public void method2()
	{
		int c = 221;
		System.out.println("This is non static method.");
		System.out.println(c);
	}
	{	
		int d = 32;
		System.out.println("This is instance block");
		System.out.println(d);
	}
	static {
		k = 12;
		System.out.println("This is static block.");
	}
	public static void main(String[] args) {
		method();
		InstanceBlock a = new InstanceBlock();
		a.method2();
		
	}

}

package exceptionProg;

public class Prog2 {
public static void main(String[]args) {
	System.out.println("Main start");
	
	int  a = 34, b = 0 , c = 0 ;
	c = a/b;
	
	System.out.println("Result = "+ c);

	throw  new ArithmeticException();
	
//	System.out.println("Main ended");
	
}
}
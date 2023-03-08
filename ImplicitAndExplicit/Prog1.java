package ImplicitAndExplicit;

public class Prog1 {

	public static void main(String[] args) {
		// implicit
				int a = 22;
				System.out.println("Values of A = "  + a);
				double b = 22.8;
				System.out.println("Values of B = " + b);
				// converting lower data type into higher data type
				double i = a ;
				System.out.println("Value of I =  " + i );
		//  explicit
				int e = (int) b;
				System.out.println("Value of E = " + e);
	}
}

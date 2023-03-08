package TypesOfVariable;

public class LocalAndIntanceVariable {
   static int i=12;
	public void method() {
		
		System.out.println("value of i=" +i);
	}
	
	public static void main(String[] args) {
		LocalAndIntanceVariable x = new LocalAndIntanceVariable ();
		x.method();
		x.method();
		System.out.println(" print the value of i " );
		//LocalAndIntanceVariable y = new LocalAndIntanceVariable();
		
	}
}
;

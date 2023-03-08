package TypesOfVariable;

public class LocalVariable {

	public  void add() {
	  int a = 33, b = 54, c;
	  c = a+b;
	  System.out.println("The addition is "+ c);
	  }
	public static void main(String[]args) {
		LocalVariable k = new LocalVariable();
		k.add();
				
	}
}

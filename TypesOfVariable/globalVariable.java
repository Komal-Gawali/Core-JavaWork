package TypesOfVariable;

public class globalVariable {
	double a=12.22, b=3.23, c;
	public void mult() {
		c = a*b;
		System.out.println("The multiplication is "+ c);
	}

	public static void main(String[] args) {
		globalVariable k = new globalVariable();
		k.mult();

	}

}

package accesseSpecifier;

public class ProgPrivate {
	private int a = 33;
	public void add() {
		
		int c = a+a;
		System.out.println("The addition is found to be " + c);
	}

	public static void main(String[] args) {
		
		ProgPrivate i = new ProgPrivate();
		i.add();

	}

}

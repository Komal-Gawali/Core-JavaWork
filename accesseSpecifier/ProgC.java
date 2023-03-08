package accesseSpecifier;

public class ProgC {
	public void sub() {
		ProgB b = new ProgB();
		b.add();
		b.method();
		
		System.out.println("----------------");
	}
	public static void main(String[]args) {
		ProgC f = new ProgC();
		f.sub();
	}

}

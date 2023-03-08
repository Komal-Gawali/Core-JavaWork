package nonStaticProg;

public class Prog3 {
	public void parameter(double a, double b) {
		double c = b/a;
		System.out.println("The dividedation = "+ c);
	}
     public static void main(String[] args) {
	Prog3 k = new Prog3();
	k.parameter(22.56, 46.55);

	}

}

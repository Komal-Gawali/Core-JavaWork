package nonStaticProg;

public class Prog2_2 {

	public static void main(String[] args) {
		System.out.println("The program of non-static method is start.");
		Prog2_1 y = new Prog2_1();
		y.multiplication();
		System.out.println("The program is ended.");
		y.multiplication();
		
	}

}

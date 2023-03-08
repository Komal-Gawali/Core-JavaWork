package nonStaticProg;

public class Prog1 {
	
     public void add() {
    	 int a = 22, b = 55, c;
    	 c = a+b;
    	 System.out.println("The addition = " + c);
     }
	public static void main(String[] args) {
		Prog1 x = new Prog1();
		x.add();
		System.out.println("The execution is done.");

	}
}

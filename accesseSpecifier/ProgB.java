package accesseSpecifier;



public class ProgB extends ProgA {

	  public void add() {
		  System.out.println(a+b);
	  }
	  public static void main(String[] args) {
		  ProgB k = new ProgB ();
		 k.add();
	}
}

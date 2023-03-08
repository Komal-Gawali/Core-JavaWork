package constructor;

public class Prog {
   static int a;
   static int b;
   public static void a() {
		b = 12;
	}
	public Prog(){
		a = 22;
		}
	    public static void main(String[] args) {
		Prog z = new Prog();
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("+++++++++++++++++++++++++++");
		z.a();
		System.out.println("A = " + a );
		System.out.println("B = " + b);
		System.out.println("+++++++++++++++++++++++++++");
	   }
	
}

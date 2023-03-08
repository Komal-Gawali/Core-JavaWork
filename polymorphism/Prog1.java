package polymorphism;

public class Prog1 {
	public void add() {
		int a = 43, b = 44, c;
		c = a+b;
		System.out.println("The result-1 is "+ c);
	}
   public void add(int a) {
	 int  d = a+a;
	   System.out.println("The result-2 is " + d);
   }
   public void add(int a, int b) {
	  int e = a+b;
	   System.out.println("The result-3 is " + e);
   }
  
   public void add(double b) {
	   double g = b+b;
	   System.out.println("The result-4 is " + g);
   }
   public void add(double a, double b) {
	   double h = a+b;
	   System.out.println("The result-5 is " + h);
   }
   public static void main(String[] args) {
		Prog1 k = new Prog1();
		k.add();
		k.add(99);
		k.add(56, 66);
		k.add(889.7);
		k.add(55.77, 77.99);
	}
}

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
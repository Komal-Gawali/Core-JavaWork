package Object;

public class Object3 {
	
	public static void addition() {
		int a = 65, b=98, c=0;
		c = a+b;
		a =b +c;
		b = a+c;
		System.out.println("Addition is  " + c);
		System.out.println("Addition is " + a );
		System.out.println("Addition is " + b );
	}
      public static void main(String[] args) {
	    addition();
       }
}

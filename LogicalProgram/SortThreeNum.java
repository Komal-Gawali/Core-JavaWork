package LogicalProgram;

public class SortThreeNum {

	public static void main(String[] args) {
		
		int a = 15, b =56, c = 1;
		int d = 47, e = 23, f = 45;
		System.out.println("Before Sorting : " + a + " " + b + " " + c);
		if(a>b) {
			int tamp = a;
			a = b; 
			b = tamp;
			System.out.println("First iteration : " + a + " " + b + " " + c);  // False
		}
		if(b>c) {
			int tamp = b;
			b = c;
			c = tamp;
			System.out.println("Second iteration : " + a + " " + b + " " + c ); // true (15, 1, 56)
		}
		if(a>b) {
			int tamp = a;
			a = b;
			b = tamp;
			System.out.println("Third iteration : " + a + " " + b + " " + c); // true (1, 15,56)
		}
		System.out.println("Last iteration : " + a + " " + b + " " + c);
		System.out.println("\t\t");
		System.out.println("Before iteration : " + d + " " + e + " " + f);
		if(d>e) {
			int temp = d;
			d = e;
			e = temp;
			System.out.println("First iteration : " + d + " " + e + " " + f);
		}
		if(e>f) {
			int temp = e;
			e = f;
			f = temp;
			System.out.println("Second iteration : " + d + " " + e + " " + f);
		}
		if(f<d) {
			int temp = f;
			f = d;
			d = temp;
			System.out.println("Third iteration : " + d + " " + e + " " + f);
		}
		System.out.println("Last iteration : " + d + " " + e + " " + f);   		
	}

}

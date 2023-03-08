package LogicalProgram;

public class SquareProg {

	public static void main(String[] args) {
		
		int a = 0, b = 1;
		System.out.print(a*a + " " + b*b);
		for(int i =1; i<= 10; i++)
		{
			int sum = a + b;
			System.out.print(" " + sum*sum);
			a = b;
			b = sum;
		}
		System.out.println();
		System.out.println("________________________");
		
		int c = 1, d = 2;
		System.out.print(d*c);
		for(int j = 1; j<=10; j++)
		{
			int mult = (c+1)*(d+1);
			System.out.print(" " + mult);
			c++;
			d++;
//			System.out.println(mult[i]++);
	   }
	}
// 0^2 1^2 2^2 3^2 5^2  
}

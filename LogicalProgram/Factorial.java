package LogicalProgram;

public class Factorial {
// 5! = 5x4x3x2x1 = 120
	public static void main(String[] args) {
		
		int num = 9, fact = 1;
		for(int i = 1; i<=num; i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}

}

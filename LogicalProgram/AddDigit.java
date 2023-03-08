package LogicalProgram;

public class AddDigit {

	public static void main(String[] args) {
		
		int num = 1332445, rem, sum = 0;
		while(num>0)
		{
			rem = num%10;
			sum = sum + rem;
			num = num / 10;
			System.out.println("Addition by iteration : " + sum);
		}
		System.out.println("Total sum : " + sum);
	}

}

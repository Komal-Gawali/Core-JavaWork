package LogicalProgram;

public class ReversseNum {
// 24535 -> 53542
	public static void main(String[] args) {
		
		int num = 24535, rem, revsNum = 0, multFactor = 10000;
		
		while(num>0)
		{
			rem = num % 10;
			revsNum = revsNum + rem * multFactor;
			multFactor = multFactor / 10;
			num = num/10;
			System.out.println("After iteration = " + revsNum);
		}
		System.out.println("Original reverse num = " + revsNum);
	}

}

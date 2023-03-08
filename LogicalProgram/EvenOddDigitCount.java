package LogicalProgram;

public class EvenOddDigitCount {

	public static void main(String[] args) {
		
		int num = 4533442, rem, count = 0, countEven = 0, countOdd = 0;
		while(num>0)
		{
			rem = num%10;
			count++;
			if(rem%2==0)
			countEven++;
			else
			countOdd++;
			num = num/10;
		}
		System.out.println("The number of even digit is " + countEven);
		System.out.println("The number of odd digit is " + countOdd);
		System.out.println("The number of digit is " + count);
	}

}

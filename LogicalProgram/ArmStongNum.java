package LogicalProgram;

public class ArmStongNum {

	public static void main(String[] args) {
//		371= 3x3x3 + 7x7x7 + 1x1x1
		int num = 371, rem, num1, sum = 0 ;
		num1 = num;
		System.out.println("Orignal num = " + num);
		while(num>0) 
		{
			rem = num%10;    // module 1
			sum = sum + rem*rem*rem;  //1
			num = num/10; //37
		}
		System.out.println(sum);
		
		if(num1==sum)
			System.out.println(sum + " is armstrong number.");
		else
			System.out.println("Is not armstrong number");
	}

}

package LogicalProgram;

import StringClass.CharAt;

// Addition of digits
// Reverse num
// Reverese String
//Armstron Num
// multiplication without using multiplication operators
public class PracticeProg1 {

	public static void main(String[] args) {
//		int num = 43567745;
//		int rem;
//		int sum = 0;
//		while(num>0) 
//		{
//			rem = num%10;
//			sum = sum+ rem;
//			num = num/10;
//		}
//		System.out.println(sum);
//		System.out.println();
//		int num1 = 43567745;
//		int rev;
//		int revNum = 0;
//		int multFact = 10000000;
//		System.out.println(num1);
//		while(num1>0) {
//			rev = num1%10;
//			revNum = revNum + rev*multFact;
//			multFact = multFact/10;
//			num1 = num1/10;
//		}
//		System.out.println(revNum);
//		System.out.println();
//		String name = "Java is one of the widly use programming language";
//		
//		String revString = "";
//		String[] splitName = name.split(" ");
//		for(int i = 0; i< splitName.length; i++) 
//		{     revString = "";
//			for(int j=0; j<splitName[i].length(); j++) {
//				char ch = splitName[i].charAt(j);
//				revString = ch + revString;
//			}
//			System.out.print(revString + " ");
//		}
		int num = 371;
		int rem;
		int sum2 = 0;
		while(num>0) {
			rem = num%10;
			sum2 = sum2 + rem*rem*rem;
			num = num/10;
			System.out.println(sum2);
		}
		System.out.println(sum2);
		int a = 18, b = 11;
		int sum1= 0;
		for(int j =1; j<=b; j++) 
			{
				sum1 = sum1+a;
			}
		System.out.println(sum1);
	}

}

package LogicalProgram;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if(num%2==0) {
			System.out.println("The given num = " + num + " is even");
		}
		else
		{
			System.out.println("The given num = " + num + " is odd");
		}
	
	}

}

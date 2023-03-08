package array;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
//		int a, b;
//		int c = a + b;
		int a, b, c;
		System.out.println("Enter the value for a and b");
		Scanner s = new Scanner(System.in);
		 a = s.nextInt();
		 b = s.nextInt();
		 c = a*b;
		
		System.out.println(c);
		System.out.println("Addition is done.");
	}

}

package MathLabs;

import java.util.Scanner;

public class MinMaxFunction {

	public static void main(String[] args) {
//		int a, b;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println( "Greater value " + Math.max(a, b));
		System.out.println("Less value " + Math.min(a, b));
		System.out.println("Multiplication is  " + Math.multiplyExact(a, b));

	}

}

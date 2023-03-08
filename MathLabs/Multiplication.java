package MathLabs;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		int a = u.nextInt();
		int b = u.nextInt();
		System.out.println("Multiplication of a and b is " + Math.multiplyExact(a, b));

	}

}

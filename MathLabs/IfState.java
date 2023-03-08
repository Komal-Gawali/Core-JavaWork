package MathLabs;

import java.util.Scanner;

public class IfState {

	public static void main(String[] args) {
	
		Scanner v = new Scanner(System.in);
		int a = v.nextInt();
		int b = v.nextInt();
		if(a>b) {
			System.out.println(Math.multiplyExact(a, b));
		}
		else if(a==b){
			System.out.println(Math.addExact(a, b));
		}
		else{
			System.out.println(Math.floorDiv(b, a));
		}
		System.out.println(Math.E);
		System.out.println(Math.log10(a));
		System.out.println(Math.PI);
		System.out.println(Math.abs(a));
		System.out.println(Math.abs(b));
		System.out.println(Math.abs(b));
		System.out.println(Math.sqrt(a));
		System.out.println(Math.cos(a));
		
		
		
		
		
	}

}

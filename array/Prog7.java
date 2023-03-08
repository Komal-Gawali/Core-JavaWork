package array;

import java.util.Scanner;

public class Prog7 {
	public static void main(String[] args) {
		
		System.out.println("Enter the number of samples is ");
		Scanner f = new Scanner(System.in);
		int numberSample = f.nextInt();
		System.out.println("Enter sample value in integer.");
		int	values[] = new int[numberSample];
		int i=0;
		do{
			values[i] = f.nextInt();    // i = 0, k= 23
		  for(int k : values )
			System.out.println("Value of sample " +   i + " is " + k);
		       i++;   }
		while(i< numberSample);
      }

}

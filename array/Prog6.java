package array;

import java.util.Scanner;

public class Prog6 {

	public static void main(String[] args) {
		  int schoolRecord;
		  System.out.println("Enter your  Percent in every year of School");
		  Scanner s = new Scanner(System.in);
		  schoolRecord = s.nextInt();
		  System.out.println("percentage in School = " + schoolRecord);
		  int record[] = new int[schoolRecord];
		  for(int i= 0; i< schoolRecord-1; i++ )
		 {
			  record[i] = s.nextInt(); 
		 }     // nested if
		  System.out.println("School Record is");
		  for(int j : record) {
			  for(int p= 0; p< schoolRecord-1; p++)
				  System.out.println("Result are " + p + "= " + j + "   ");
		  }
			  System.out.println("Record is complete");
		  
	}

}

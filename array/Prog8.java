package array;

import java.util.Arrays;

public class Prog8 {

	public static void main(String[] args) {
		String months[] = new String[5];
		       months[0] = "January";
		       months[1] = "February";
		       months[2] = "March";
		       months[3] = "April";
		   for(int i =0; i< months.length-1; i++)
			   System.out.println("A month of calender = " + months[i]);
		   System.out.println("________________________________");
		   Arrays.sort(months);
		   for(int k= 0; k< months.length; k++ )
		   System.out.println(months[k]);
		   System.out.println("Revers order");
		   for(int j = months.length-1; j>=0; j--)
			   System.out.println(months[j]);
		   }

}

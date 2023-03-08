package StarPatternProg;

public class Prog1 {

// ****
// ****
// ****
// ****
	public static void main(String[] args) {

	 for(int row=1; row<=4; row++) 
	 {
		for(int col = 0; col<=4; col++) 
		    {
		     System.out.print("*");
		    }
			System.out.println();
	 }
		for(int row= 1; row<=4; row++)
	 {
			for(int col = 1; col<=4; col++) 
			{
				System.out.print(col);
			}
			System.out.println();
	}
		for(int i=1; i<=4; i++)
		{
//			for(int j =1; j<=4; j++)
//			{
//				System.out.print("  ");
//			}
			for(int s =1; s<=4; s++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	 	
	}

}

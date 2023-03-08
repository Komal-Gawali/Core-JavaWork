package StarPatternProg;

public class prog2 {
// *
// **
// ***
// ****
// ****
	public static void main(String[] args) {
		int star = 1, space = 4;
		for(int row = 1; row<=5; row++)
		{
			for(int j =1; j<=star; j++) 
			{
			System.out.print("*");	
			}
			for(int k=0; k<=space; k++)
			{
				System.out.print(" ");
			}
			System.out.println();
			star++;
			space--;
		}
	}

}

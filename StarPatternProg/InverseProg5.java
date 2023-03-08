package StarPatternProg;

public class InverseProg5 {
//  *
// **
//***
// **
//	*
	public static void main(String[] args) {
		
		int star=1, space=2;
		for(int row=1; row<=5; row++)
		{
			for(int i = 1; i<=space; i++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(row<3) 
			{
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
			
		}
	}

}

package StarPatternProg;

public class InverseProg6 {
//*****
// ***
//	*
// ***
//*****
	public static void main(String[] args) {
		
		int star = 5, space = 0;
		for(int row =1; row<=5; row++)
		{
			for(int i = 1; i<=space; i++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(row<3)
			{
				star=star-2;
				space++;
			}
			else
			{
				star=star+2;
				space--;
			}
		}
	}

}

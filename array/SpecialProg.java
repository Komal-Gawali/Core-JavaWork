package array;

public class SpecialProg {

	public static void main(String[] args) {
		String nameRec[][] = new String[2][2];
		nameRec[0][0] = "Joy";
		nameRec[0][1] = "Giggy";
		nameRec[1][0] = "Hobby";
		nameRec[1][1] = "Tylor";
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j<2; j++)
				{System.out.print(nameRec[i][j] + "  ");
				  }
				System.out.println();
		}
	}

}

package StarPatternProg;

public class Prog5 {
//*
//**
//***
//**
//*
	public static void main(String[] args) {
		
		int star=1, space=2;
		for(int row=1; row<=5; row++)
		{
			for(int i = 1; i<=star; i++)
			{
				System.out.print("*");
			}
			for(int j = 1; j<=space; j++)
			{
				System.out.print(" ");
			}
			System.out.println();
			if(row<=3)
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

package StarPatternProg;

public class InverseProg2 {
//*****
//****
//***
//**
//*
	public static void main(String[] args) {
		int star = 5, space = 0;
		for(int row = 1; row <=5; row++) 
		{
			for(int i=1; i<=star; i++)
			{
				System.out.print("*");	
			}
			for(int j=1; j<=space; j++)
			{
			    System.out.print(" ");	
			}
			System.out.println();
			star--;
			space++;
		}
//	  for(int row=1; row<=4; row++)	
//	  {
//		  for(int k=1; k<=star; k++)
//		  {
//			  System.out.print("*");
//		  }
//		  for(int l=1; l<=space; l++) {
//			  System.out.print(" ");
//		  }
//		  System.out.println();
//		  star--;
//		  space++;
//		  
//	  }
	}

}

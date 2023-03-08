package LogicalProgram;

public class PrimeNum {

	public static void main(String[] args) {
		
		int num = 13, count = 0;
		if(num>0) 
		{
			for(int i = 1; i<=num; i++) 
			{
				if(num%i==0)
				{
					count++;
					break;	
				}
			}
		}
		if(count==1)
		{
			System.out.println(num + " is prime number.");
		}
		else
			System.out.println(num + " is not prime number.");
	}

}

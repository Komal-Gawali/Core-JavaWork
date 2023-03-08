package LogicalProgram;

public class SeparateEvenAndOddNum {

	public static void main(String[] args) {
		
		int arr[] = {34,77,23,2,10,77,55};
		
			for(int value : arr)
			{
			if(value%2 == 0)
				System.out.print(value + " ");
			}
			System.out.println();
			System.out.println("___________________");
			for(int value : arr) 
			{
			if(value%2!=0)
				System.out.print(value + " ");
			}
	}

}

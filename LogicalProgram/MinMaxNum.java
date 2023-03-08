package LogicalProgram;

public class MinMaxNum {

	public static void main(String[] args) {
		int arr[] = {7, 55,73,54,20,88,37,33, 2};
		int max = arr[0];
		for(int i = 1; i< arr.length; i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		System.out.println("The max value = " + max); 
		int min = arr[0];
		for(int j = 1; j<arr.length; j++)
		{
			if(min>arr[j])
				min = arr[j];
		}
		System.out.println("The minn value = " + min);
	}

}

package LogicalProgram;

public class ReverseByEachWord {

	public static void main(String[] args) {
		
		String str = "Hello I am Automation Engineer";
		String revString = "";
		String arr[] = str.split(" ");
		System.out.println(str);
		for(int i = 0; i<arr.length; i++)
		{
//			System.out.println(arr[i]);
			revString = "";
			for(int j = 0 ; j <arr[i].length(); j++) 
			{
				char ch = arr[i].charAt(j);
				revString = ch + revString;
			}
			System.out.print(revString + " ");
		}
		
	}

}

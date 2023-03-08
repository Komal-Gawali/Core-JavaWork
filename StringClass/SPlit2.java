package StringClass;



public class SPlit2 {

	public static void main(String[] args) {
		String bod = "15-Aug-1947";
		String bodArray[] = bod.split("-");
		System.out.println("Birth date Before Split = " + bod);
	System.out.println("________________");
	System.out.println("Birth date After Split : ");
	for(int i = 0; i<bodArray.length; i++)
	System.out.println(bodArray[i]);
		String bod1 = "15.Aug.1974";
		String bod1Array[] = bod1.split(".");
     	System.out.println("Birth date is " + bod1);
		System.out.println("**************************");
		System.out.println("After split");
		for(int j = 0 ; j < bod1Array.length; j ++)
			{
			System.out.println( bod1Array[j]);
			}
		

	}

}

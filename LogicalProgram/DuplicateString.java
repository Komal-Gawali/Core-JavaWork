package LogicalProgram;

public class DuplicateString {

	public static void main(String[] args) {
		
		String str[] = {"English", "Marathi", "Math", "Hindi", "Math"};
		int count = 0;
		String duplStr = "";
		boolean resStr = false;
		
	    for(int i = 0 ; i < str.length; i++)
	    {
	    	 duplStr = str[i];
	    	for(int j = i+1; j< str.length; j++)
	     {
	    	if(duplStr == str[j])
	    	{
	    		count++;
	    		resStr = true;
	    	}
	     }
	    	 
	    }
	    System.out.println(duplStr);
       	    if(resStr == true)
	    {
       	    	
	    	System.out.println("There is Duplicate Value");
	    }
	    else 
	    	System.out.println("No Duplicate value");
	}

}

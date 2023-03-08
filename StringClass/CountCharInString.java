package StringClass;

import java.util.Scanner;

public class CountCharInString {
	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		String name = u.nextLine();
		int count = 0 ;
		char[] ch = ch = name.toCharArray() ;
		for(int i = 0; i<ch.length; i++)
	{
			count = 1;		
			for(int j= i+1; j< ch.length; j++) 
	    {    
				if(ch[i]==ch[j] && ch[i]!='0')
			{    count++;
			     ch[j]='0';	
		    }
		}
			  //A character is considered as duplicate if count is greater than 1    
            if(count > 1 && ch[i] != '0')    
                System.out.println(name+" contains "+ch[i]+" "+ count + " times");   
            else 
    		{
    			System.out.println(" No duplicate char present");
    		}
    }          
		
	}

}

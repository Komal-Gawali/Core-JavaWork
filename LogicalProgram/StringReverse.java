package LogicalProgram;

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "I am Testing Engineer";
		String revsStr = "" ;
		
//		System.out.println(str.length());
		for(int i = str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            System.out.print(ch);
           }
		
		System.out.println();
		String split[] = str.split(" ");
//		System.out.println(split.length);  4 
		for(int i = split.length-1; i>=0; i--)
		   System.out.print("Reverse string " + split[i] + " ");
	}

}

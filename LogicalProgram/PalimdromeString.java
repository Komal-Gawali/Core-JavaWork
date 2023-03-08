package LogicalProgram;

public class PalimdromeString {

	public static void main(String[] args) {
		
		String str = "eye";
		String revStr = "";
		System.out.println(str.length());
		for(int i = str.length()-1; i>=0; i-- )
		{
			char ch = str.charAt(i);
			revStr = revStr + ch;
		}
		if(str.equals(revStr)) {
			System.out.println(str + " Is palimdrome String");
		}
		else
			System.out.println(str + "Is not palimdrome String");
	}

}

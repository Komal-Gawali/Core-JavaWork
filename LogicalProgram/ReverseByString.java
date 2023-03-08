package LogicalProgram;

public class ReverseByString {

	public static void main(String[] args) {
		
		int num = 4453346;
		 
		 String str = Integer.toString(num);
		 String resNum = "";
		 
//		 System.out.println(str);       4453346
		for(int i = str.length()-1; i>=0; i--)
		{
			char ch = str.charAt(i);
			resNum = resNum + ch;
			
		}
		System.out.println(resNum);
	}

}

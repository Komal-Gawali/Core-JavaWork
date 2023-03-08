package LogicalProgram;

public class NumCount {

	public static void main(String[] args) {
		
		int num = 1234564, count=0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println(count + " is Number of digit in " + num);
	}

}

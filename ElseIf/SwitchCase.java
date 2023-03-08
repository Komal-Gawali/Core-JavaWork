package ElseIf;

public class SwitchCase {

	public static void main(String[] args) {
		
		int num1 = 48, num2 = 5;
		char a = '%';
		switch(a)
		{
		case '+': 
			int rem = num1 + num2; 
			{
				System.out.println(rem);
			}
			break;
		case '-':
			int rem1 = num1 - num2;
		{
			System.out.println(rem1);
		} break;
		case '%':
			int rem2 = num1%num2;
			{
				System.out.println(rem2);
			}
			break;
			default:
			{
				System.out.println(num1);
			}
		}
		
		
	}

}

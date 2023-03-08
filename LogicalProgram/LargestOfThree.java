package LogicalProgram;

public class LargestOfThree {

	public static void main(String[] args) {
		
		int a = 88, b = 33, c = 78;
		if(a>b && a>c)
			System.out.println("The most greater value = " + a);
		if(b>c && b>a)
			System.out.println("The most greater value = " + b);
//		else
//			System.out.println("The most greater value = " + c);
		if(c>a && c>b)
			System.out.println("The most greater value = " + c);
//		if we use else that syso will print as well
	}

}

package scannerProg;
import java.util.Scanner;
public class Prog1Int {

	public static void main(String[] args) {
		
		System.out.println("Program is started");
		Scanner u = new Scanner(System.in);
		int a = u.nextInt();
		int b = u.nextInt();
		int c = a + b;
		System.out.println("Addition is  " + c );
		System.out.println("Program is end ");
		}

}

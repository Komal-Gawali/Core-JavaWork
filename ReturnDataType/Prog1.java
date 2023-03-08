package ReturnDataType;

public class Prog1 {
	
	public static int m1() {
		
		return 25;
	}
    
	 public static int m2() {
		 return 55;
	 }
	public static void main(String[] args) {
		int m = m1();
		int n = m2();
		System.out.println("Result = "+n*m);
		
		int l = m3();
		System.out.println("Result = "+ (m+n+l));

	}
	public static int m3() {
		return 78;
	}

}








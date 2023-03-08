package ReturnDataType;

public class SuperKeyword extends PrivateMethod {

	public void kom3() {
		super.kom3();
		int g =90;
		System.out.println( "This is current superKeyword Class " + g);
		super.kom3();
	}
	
	public static void main(String[] args) {
		SuperKeyword k = new SuperKeyword();
		
		k.kom3();
		
	}

}

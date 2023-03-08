package StringClass;

public class Equa {
	// String a = "home ";
	//instance variable 

	public static void main(String[] args) {
		String b = "Home";
		String c = "home";
		String a = new String("Home");
		if(b==c) 
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		if(b==a)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
			
	}

}

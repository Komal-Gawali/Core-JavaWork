package StringClass;

public class Empty {

	public static void main(String[] args) {
		String a = new String("Champion");
		String b = "";
		String c = new String(" ");
		System.out.println(a.isEmpty());  // false
		System.out.println("***********************");
		System.out.println(b.isEmpty()); // true
		System.out.println("***********************");
		System.out.println(c.isEmpty()); // false

	}

}

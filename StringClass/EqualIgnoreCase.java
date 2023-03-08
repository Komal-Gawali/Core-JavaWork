package StringClass;

public class EqualIgnoreCase {
// Not case sensitive
	public static void main(String[] args) {
		String a = "Java Program";
		String b = "java program";
		String c = new String("Java Program");
		System.out.println(a.equalsIgnoreCase(a));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println("*********************");
		System.out.println(a.equalsIgnoreCase(a));
		System.out.println("*********************");
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println("*********************");
		System.out.println(c.equalsIgnoreCase(a));

	}

}

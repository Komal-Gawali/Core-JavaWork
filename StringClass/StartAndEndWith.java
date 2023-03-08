package StringClass;

public class StartAndEndWith {

	public static void main(String[] args) {
		String name = "Automation  is one of the procces of testing.";
		System.out.println("length = " + name.length());
		System.out.println(name.startsWith("Aut"));  //true
		System.out.println(name.startsWith("mati")); //false
		System.out.println(name.startsWith("auto"));  //false
		System.out.println(name.startsWith("Auto"));   //true
		System.out.println(name.endsWith("testing"));  //false
		System.out.println(name.endsWith("testing.")); // true
		System.out.println(name.endsWith("ting."));    //true
	}

}

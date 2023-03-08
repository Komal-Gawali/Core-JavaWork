package StringClass;

public class Replace {

	public static void main(String[] args) {
		String operation = "Addition is one of the mathematical operation";
		System.out.println(operation.replace("Addition", "Substraction"));
		System.out.println(operation.replace("one","two"));
		System.out.println(operation.replace("Addition", "Addition And Substraction"));
		System.out.println(operation.replace("o", "OO"));
		System.out.println(operation.replace("io", "ooo"));
	}

}

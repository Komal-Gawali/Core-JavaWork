package StringClass;

public class LastIndex {
   // last index of string  
	public static void main(String[] args) {
		String name = "Program";   // 0 1 2 3 4  5 6  right to left
		System.out.println("Length = " + name.length()); //7
		System.out.println(name.lastIndexOf("m"));  //6
		System.out.println(name.lastIndexOf("a"));  //5 
        System.out.println(name.lastIndexOf("r")); // 4

	}

}

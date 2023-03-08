package StringClass;

public class Equal1 {

	public static void main(String[] args) {
//		.equals() case sensitive
       String name = "Force";
       String name1 = "force";
       String name2 = new String("Force");
       System.out.println(name.equals(name1));
       System.out.println("************************");
       System.out.println(name.equals(name2));
       
	}

}

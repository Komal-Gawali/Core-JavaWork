package StringClass;
// length, toUpperClass, toLowerClass, startsWith, endsWith, indexOf, conCat, charAt, 
public class UseStringMethod {

	public static void main(String[] args) {
		String name = "Komal Gawali";
		String discription = " QA engineer";
		String name2 = "Komal Gawali";
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println();
		System.out.println(name.concat(discription));
	
		if(name.startsWith("K"))
		{
			System.out.println( "Start with " + name);
		}
		else {
			System.out.println("The value is not started with K");
		}
		 System.out.println();
		  System.out.println(name.charAt(10));
		  System.out.println();
		  System.out.println(name.indexOf("K"));
		System.out.println();
		if(name.endsWith("i")) {
			System.out.println( "Ends with " +  name);
		}
		else {
			System.out.println("The value is not ends with I");
		}
		  String name1[] = name.split(" ");
		  for(int i = 0; i<name1.length; i++)
		  {		
			  System.out.println(name1[i]);
		  }
		  
	}

}

package UseLess;

public class Prog2 {

	public static void main(String[] args) {
		
		int mark = 0;
		boolean cond = false;
		String name = new String("Komal");
		String sirName = new String("Gawali");
		String a = "   Komal Gawali @12333   ";
		
		if(mark> 40 && mark < 80) {
			cond = true;
			 System.out.println(cond);
		}
        else
        	if(mark<40 && mark > 10) {
        		cond = false;
        		 System.out.println(cond);
        	}
       else
       {
    	   System.out.println("condition not follow");
       }
		
		System.out.println(name.concat(" ").concat(sirName));
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf('a'));
		System.out.println(name.indexOf('K'));
		System.out.println(name.indexOf('l'));
		System.out.println(name.charAt(1));
		System.out.println("Length of name is " +  name.length() + " And Length of sirName is " + sirName.length());
		
		System.out.println(a.strip());
		System.out.println(a.trim());
		
		
		System.out.println(a.hashCode());
		System.out.println(a.codePointCount(0, 4));
		System.out.println(name.contains("oml"));
		
	}

}

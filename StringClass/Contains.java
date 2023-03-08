package StringClass;

public class Contains {
	public void method1() {
		String a = "Program";
		String b = "Integration";
		System.out.println(a.contains(b)); // false
		System.out.println("****************************");
		
		String name = "Komal";
		System.out.println(name.contains("a"));
		
		System.out.println("****************************");
	}
	public void method2() {
		String c = "Differentiation";
		String c1 = "differentiation";
		String d = new String("Differentiation");
		String e = new String("differentiation");
		String f = new String("differentiation");
		System.out.println(c.contains(d));  // true
		System.out.println(c.contains(e));   //false
		System.out.println(e.contains(f));    // true
		System.out.println(e.contains("differentiation"));  // true
		System.out.println(c.contains(c1));   //case sensitive false
	}
    public static void main(String[] args) {
    	Contains k = new Contains();
    	k.method1();
    	
        k.method2();
	}

}

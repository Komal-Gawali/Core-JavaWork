package nonStaticProg;

public class Prog5 {
	public void candidate() {
		String name = "Komal Gawali";
		System.out.println("the name of candidate is "+ name);
	}
	public void candidate1(String bod) {
		System.out.println("Birth date of candidate is " + bod);
	}
    public static void main(String[] args) {
		Prog5 k = new Prog5();
		k.candidate();
        k.candidate1("28/12/1998");
	}

}

package StringClass;

public class Trim {
    
	public static void main(String[] args) {
		String str[] = new String[8];
		str[0] = "Komal";
		str[1] = "Rahul";
		
		String sentence = "               We done automation     testing               ";
		System.out.println(sentence.trim());
		for(String i : str)
		System.out.println(i);

	}

}

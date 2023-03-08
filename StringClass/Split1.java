package StringClass;

public class Split1 {
	public static void main(String[] args) {
		String rule = "In the constitution of india";
		String ruleArray[] = rule.split(" ");
		System.out.println("Before split :  " + rule);
		System.out.println("______________________");
		System.out.println("After Split  : " );
		for(int j= 0; j<ruleArray.length; j++)
		System.out.println(    ruleArray[j]);
	}

}

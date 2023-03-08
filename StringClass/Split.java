package StringClass;

public class Split {

	public static void main(String[] args) {
		String statement = "Mr. C. V. Ramam Says that the Numbers is Interesting.";
		String statementArray[] = statement.split(" ");
				System.out.println("Statement Before Spliting :  " + statement );
				System.out.println("---------------------------");
		System.out.println("Statement After Spliting ");
//     	System.out.println(statementArray[]);
		for(int i = 0 ; i < statementArray.length; i++)
		System.out.println(statementArray[i]  );
		
//		for(String i : statementArray)
//		System.out.println(i);
		
//		String	sentence	=	"I	am	an	automation	engineer	who	loves	to	work	on	Selenium	with	java";	
		
//		String	sentenceArray[]	=	sentence.split("	");	
//			
//		System.out.println("Orirional	Sentence	:	"	+	sentence);	
//			
//		System.out.println("After	split	:");	
//			
//		for(int	i=0;i<sentenceArray.length;i++)	System.out.print(sentenceArray[i]	+	"	");	
//			
//		System.out.println("\n---------------------------------");	for(String	a	:	sentenceArray)	
//		System.out.println(a);	

	}

}

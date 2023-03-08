package TypesOfVariable;

public class Prog1 {

	int	num1	=	10;			//	4	x	no	of	object	(3)	=	12			//Instance	/	Global	/	Non	static	
	static	int	num2	=	10;		//4	byte		//Instance	/	Global	/	static	
		
	public	void	increment()	
	{	
			//10	->	11	-	12	-	13			
		System.out.println(num1	+	"				"	+	num2);	
		System.out.println("____________________");
		num1++;		//11	
		num2++;	
		System.out.println(num1	+	"				"	+	num2);	
	}	
		
	public	static	void	main(String[]	args)	{	
	
		Prog1	x	=	new	Prog1();		//Num1	=	10		num2=10			
		x.increment();	
			
		Prog1	y	=	new	Prog1();		//Num1	=	10			num2=11			
		y.increment();	
			
		Prog1	z	=	new	Prog1();		//Num1	=	10		num2=12	
		z.increment();		
			
		Prog1	z11	=	new	Prog1();		//Num1	=	10		num2=13	
		z11.increment();	
	}	
}	
	

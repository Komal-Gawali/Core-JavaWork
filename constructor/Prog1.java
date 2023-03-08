package constructor;

public class Prog1 {
	static	int	a;	
	static	int	b;	
		
	public	static	void	m1()	
	{	
	b	=	20;	
	}	
	public	Prog1()	
	{	
	a	=	10;	

	}
	public static void main(String[] args) {
		Prog1	z	=	new	Prog1();	
		System.out.println("A	=	"	+	a);	//10	
		System.out.println("B	=	"	+	b);	//0
		System.out.println("----------------");	
		m1();	
		System.out.println("A	=	"	+	a);	//10	
		System.out.println("B	=	"	+	b);	


	}

}

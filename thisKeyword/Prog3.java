package thisKeyword;

public class Prog3 {

	Prog3()
	{	
		this(123);
		System.out.println("Zero	parametrized	constructor");	
	}	
		
	public	Prog3(int	a)	
	{	
		this(45.6);
		System.out.println("Parametrized	constructor	A	=	"	+	a);	
			
	}	
	public	Prog3(double	a)	
	{	
		
		System.out.println("Parametrized	constructor	A	=	"	+	a);	
			
	}	
		
	public	static	void	main(String[]	args)	{	
		Prog3 k = new Prog3();
	
		
	}	
	
}	

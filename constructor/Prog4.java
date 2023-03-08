package constructor;

public	class	Prog4	{	
		//Constructor	overloading		public	Prog4()	
		public Prog4(){	
			System.out.println("This	is	zero	argument	constructor");	
		}	
			
		public	Prog4(int	a)	
		{	
			System.out.println("This	is	one	argument	constructor");	
		}	
			
		public	Prog4(int	a,	int	b)	
		{	
			System.out.println("This	is	two	argument	constructor");	
		}	
			
		public	Prog4(double	b)	
		{	
			System.out.println("This	is	one	double	type	argument	constructor");	
		}	
			
		public	static	void	main(String[]	args)	{	
		
			Prog4	x1	=	new	Prog4();	
			Prog4	x2	=	new	Prog4(1);	
			Prog4	x3	=	new	Prog4(1,2);	
			Prog4	x4	=	new	Prog4(1111.111);	
		}	
	}	



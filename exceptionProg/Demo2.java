package exceptionProg;

public class Demo2 {

//	public static void m1() {
//		try {
//			int a = 19, b = 0;
//			int c = a/b;	
//			System.out.println(c);
//		}
//		catch(Exception e ) {
//			System.out.println(e);
//			
//		}
//		
//		
//	}
	
	public static void main(String[] args) throws ArithmeticException {
		
//		m1();
           System.out.println("Programm is started");
           int a = 34, b = 0, c = 0;
          try {
        	   c = a / b ;
          }
          catch(ArithmeticException r)
          {
               	   System.out.println("Result = " + r );   
          }
           System.out.println("fraction is " + c);
           System.out.println("Program is terminated");
           
	}
}
//		System.out.println("Main	starts");	int	a	=	10,	b	=	0,	c	=	0;	
//		
//		try	{	c	=	a	/	b;	
//		}	
//		catch(Exception	z)	{	
//		System.out.println("Exception	is	handled	and	exception	is	:->	"	+	z);	
//		}	
//			
//		System.out.println("Result	=	"	+	c);	
//			
//		System.out.println("Main	ends");	
//		}	
//		}	

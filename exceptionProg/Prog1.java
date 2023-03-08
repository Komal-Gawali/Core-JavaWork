package exceptionProg;

public class Prog1 {

	public static void main(String[] args)    {
	  
		try	
		{	
		System.out.println(10/0);	
		}
		
		catch	(NullPointerException	n)
		{	System.out.println("Exception	handled	-	"	+	n);	
		}	
		catch(ArrayIndexOutOfBoundsException	ai)	
		{	
		System.out.println("Exception	handled	-	"	+	ai);	
		}	
		catch	(ArithmeticException	ae)	{	
		System.out.println("Exception	handled	-	"	+	ae);	
		}	
		catch(Exception	e)	
		{	
		System.out.println("Exception	handled	-	"	+	e);	
		}
			finally	{	
				int a=0, b= 2;
				int c = b/a;
				System.out.println(c);
			System.out.println("There is no issue");
		}
		
		
		}	
		}	

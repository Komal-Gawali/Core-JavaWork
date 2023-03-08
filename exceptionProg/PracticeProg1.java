package exceptionProg;

import java.io.FileNotFoundException;

public class PracticeProg1 {

	public static void main(String[] args){
		
	try {
		String name = "Komal";
		System.out.println(name.length());
		System.out.println(name.charAt(6));
	} 
	catch (ArithmeticException e) {
		System.out.println("Arithmeetic Exception is occured.");
	}	
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index out of bound Exception is occured.");
	}
	catch (StringIndexOutOfBoundsException e) {
		System.out.println("String index out of bound Exception is occured.");
	}
	catch (NullPointerException e) {
		System.out.println("Null pointer Exception is occured.");
	}
	finally {
		System.out.println("This is finally block");
	}
	}

}

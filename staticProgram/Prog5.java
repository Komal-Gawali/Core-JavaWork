package staticProgram;

public class Prog5 {
	public static void employee()
	{
		String empName = "Harry Porter";
		System.out.println("Name of Employee = " +empName);
	}
	public static void employee1(double salary) 
	{
		System.out.println("The salary of Employee = "+ salary);
	}
     public static void main(String[] args)
     {
		employee();
		employee1(40000.45);
		}
}

package polymorphism;

public class encapsulation {
	
	private double salary;
	public void emplInfo(double empSalary) {
	 salary = empSalary;
	}
	public void empGetSalary() {
		System.out.println("The salary of employee = " + salary);
	}
     public static void main(String[] args) {
		 encapsulation k = new encapsulation();
		 k.emplInfo(788888.90);
		 k.empGetSalary();
		 
	}

}

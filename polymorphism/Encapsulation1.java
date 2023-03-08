package polymorphism;

public class Encapsulation1 {

	private   String password ;
	public void setPass(String newpass) {
		 password = newpass;
	}
	public void password() {
		System.out.println("a password of facebook account is " + password);
	}
	public static void main(String[] args) {
		Encapsulation1 p = new Encapsulation1();
		p.setPass("komal@123");
		p.password();
		
	}
}

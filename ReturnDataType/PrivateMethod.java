package ReturnDataType;

public class PrivateMethod {

	private void kom() {
		
		int a = 33;
		System.out.println(a);
		
	}
	protected void kom1() {
		this.kom();
		int b = 21;
		System.out.println(b);
	}
	void kom2() {
		this.kom1();
		int c = 212;
		System.out.println(c);
	}
	public void kom3() {
		this.kom2();
		int d = 43;
		System.out.println(d);
	}
	public static void main(String[]args) {
		PrivateMethod p = new PrivateMethod();
//		p.kom();
//		p.kom1();
//		p.kom2();
    	p.kom3();
	}
}

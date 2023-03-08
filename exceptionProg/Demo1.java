package exceptionProg;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		int set[] = {34, 45, 56, 23, 665, 65};
		Thread.sleep(55500);
		System.out.println(set[0]+set[5]);
		Thread.sleep(10500);
		System.out.println(set[5]+set[3]);
		Thread.sleep(85500);
		System.out.println(set[3]+set[2]);
		Thread.sleep(95500);
		System.out.println(set[2]+set[4]);
		Thread.sleep(98500);
		System.out.println(set[4]+set[1]);
		Thread.sleep(50900);
		System.out.println(set[1]+set[0]);

	}

}

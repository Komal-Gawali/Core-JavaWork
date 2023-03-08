package StringClass;

public class useStringMethod1 {

	public static void main(String[] args) {
		
		String arr[] = new String[9];
		arr[0] = "June";
		arr[1] = "July";
		arr[2] = "Agust";
		arr[3] = "September";
		arr[4] = "Octomber";
		arr[5] = "November";
		arr[6] = "December";
		arr[7] = "January";
		for(String month : arr) {
			
			System.out.println(month);
		}
		arr[8] = "February";
		System.out.println(arr[8]);
	}

}

package array;

import org.openqa.selenium.By;

public class Prog11 {

	public static void main(String[] args) {
		
		String[][] name = {{"Komal", "Chaitu"}, {"Ashwin", "Ash"}, {"Rohit", "virat"}};
		int[][] a = {{1,5,6}, {2,6,6}, {3,2,6}};
		for(int i = 0; i< 2; i++) {
			for(int j = 0; j< 3; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
		for(int k = 0; k<3; k++) {
			for(int g = 0; g<2; g++) {
				System.out.print(name[k][g] + " ");
			}
			System.out.println();
		}
		System.out.println(name.length);
		for(String[] b : name) {
			System.out.println(b);
		}
		
	}

}

package arrays;

import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [][][] myArr = new int[2][3][5];

		for(int i = 0; i < myArr.length; i++) {
			for(int j = 0; j < myArr[0].length; j++) {
				for(int k = 0; k < myArr[0][0].length; k++) {
					System.out.println("Enter the number: ");
					myArr[i][j][k] = scanner.nextInt();
				}
			}
		}
		
		System.out.println("************************************************************************");
		int sum = 0;
		for(int i = 0; i < myArr.length; i++) {
			int sum1 = 0;
			for(int j = 0; j < myArr[0].length; j++) {
				for(int k = 0; k < myArr[0][0].length; k++) {
					System.out.print(myArr[i][j][k]);
					sum += myArr[i][j][k];
					sum1 += myArr[i][j][k];
				}
				System.out.print(" ");
			}
			System.out.print(" " + sum1);
			System.out.println();
		}
		System.out.println(sum);
		scanner.close();
	
	}
	


	}



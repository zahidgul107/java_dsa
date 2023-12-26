package arrays_array_list.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

//		int[][] arr = new int[3][];
//		
//		int[][] arr2D = {
//				{2, 4, 7},
//				{5, 1},
//				{9, 3, 6, 8}
//		};

		int[][] arr = new int[3][3];

		// Input
		for (int row = 0; row < arr.length; row++) {
			// for each col in every row
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = in.nextInt();
			}
		}

		// Output
//		for(int row = 0; row < arr.length; row++) {
//			// for each col in every row
//			for(int col = 0; col < arr[row].length; col++) {
//				System.err.print(arr[row][col]);
//			}
//			System.err.println();
//		}

//		// Output Enhanced for 
//		for(int row = 0; row < arr.length; row++) {
//			// for each col in every row
//			System.err.println(Arrays.toString(arr[row]));
//		}

		// Output Enhanced for
		for (int[] a : arr) {
			// for each col in every row
			System.err.println(Arrays.toString(a));
		}

	}

}

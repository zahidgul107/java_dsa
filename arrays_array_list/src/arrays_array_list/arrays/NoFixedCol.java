package arrays_array_list.arrays;

import java.util.Arrays;

public class NoFixedCol {

	public static void main(String[] args) {
		int[][] arr2D = { 
				{ 2, 4, 7 }, 
				{ 5, 1 }, 
				{ 9, 3, 6, 8 } 
			};
		
		for(int row = 0; row < arr2D.length; row++) {
			for(int col = 0; col < arr2D[row].length; col++) {
				System.err.print(arr2D[row][col] + " ");
			}
			System.err.println();
		}

	}

}

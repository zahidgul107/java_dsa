package question;

import java.util.Arrays;

public class OddNumbersOnly {
	
	public static void main(String [] args) {
		
		int[] arr = {4, 3, 2, 7, 8, 9, 5};
		
		int[] oddArr = removeEvenNumbers(arr);
		System.err.println(Arrays.toString(oddArr));
	}

	private static int[] removeEvenNumbers(int[] arr) {
		
		int oddCount = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		
		int[] result = new int[oddCount];
		int odx = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				result[odx] = arr[i];
				odx++;
			}
		}
		return result;
	}

}

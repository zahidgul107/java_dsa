package question;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] arr = {2, 11, 5, 10, 7, 8};
	//	System.err.println(Arrays.toString(arr));
		System.err.println(Arrays.toString(reverse(arr)));
		
	}
	
	public static int[] reverse(int[] arr) {
		
		int[] result = new int[arr.length];
		int index = 0;

		for(int i = arr.length - 1; i >= 0; i--) {
			result[index++] = arr[i];
		}
		
		return result;
	}
	
	

}

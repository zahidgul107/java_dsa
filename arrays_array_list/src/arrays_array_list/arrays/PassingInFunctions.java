package arrays_array_list.arrays;

import java.util.Arrays;

public class PassingInFunctions {
	
	public static void main(String[] args) {
		
		int[] nums = {4, 6, 3, 8};
		System.err.println(Arrays.toString(nums));
		change(nums);
		System.err.println(Arrays.toString(nums));
	}
	
	static void change(int[] arr) {
		arr[0] = 10;
	}

}

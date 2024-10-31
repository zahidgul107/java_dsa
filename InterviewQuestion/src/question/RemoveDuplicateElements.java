package question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		int[] arr = {2, 5, 4, 8, 9, 3, 5, 4};
		int[] res = removeDuplicate(arr);
		System.err.println(Arrays.toString(res));
	}
	
	public static int[] removeDuplicate(int[] arr) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		int[] result = new int[set.size()];
		int index = 0;
		for(int num : set) {
			result[index++] = num;
		}
		
		return result;
	}

}

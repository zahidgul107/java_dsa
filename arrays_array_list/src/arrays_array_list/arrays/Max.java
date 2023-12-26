package arrays_array_list.arrays;

public class Max {

	public static void main(String[] args) {
		
		int[] arr = {1, 3333, 3633, 424, 9};
		
		System.err.println(max(arr));
		System.err.println(maxRange(arr, 1, 3));
	}
	
	public static int max(int[] nums) {
		if (nums.length == 0) {
			return -1;
		}
		int maxVal = nums[0];
		for(int a : nums) {
			if(a > maxVal) {
				maxVal = a;
			}
		}
		return maxVal;
	}
	
	public static int maxRange(int[] arr,int start,int end) {
		if (arr.length == 0) {
			return -1;
		}
		int maxVal = arr[start];
		for (int i = start; i <= end; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;
	}

}

package linear_search_algorithm.linear;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {32,7, 452, 44, 252, 45};
		int target = 45;
		int ans = linearSearch(nums, target);
		System.err.println(ans);
		
	}
	
	static int linearSearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			int element = arr[i];
			if (element == target) {
				return i;
			}
		}
		return -1;
	}

}

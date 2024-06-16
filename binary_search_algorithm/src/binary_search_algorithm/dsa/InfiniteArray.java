package binary_search_algorithm.dsa;

public class InfiniteArray {
	
	public static void main(String args[]) {
		
	}
	
	static int binarSearch(int[] arr, int target, int start, int end) {

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < arr[mid])
				end = mid - 1;
			else if (target > arr[mid])
				start = mid + 1;
			else
				return mid;
		}
		return -1;
	}

}

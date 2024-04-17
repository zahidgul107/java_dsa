package binary_search_algorithm.dsa;

public class FirstAndLastPosition {

	public static void main(String[] args) {

		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] ans = searchRange(nums, target);
		for (int i = 0; i < ans.length; i++) {
			System.err.println(ans[i]);
		}
	}

	static int[] searchRange(int[] nums, int target) {
		int[] result = { -1, -1 };

		// Check for first occurrence if target first
		int start = search(nums, target, true);
		if (start != -1) {
			int end = search(nums, target, false);
			result[1] = end;
		}

		result[0] = start;

		return result;
	}

	// This function returns just returns the index value of target
	static int search(int[] nums, int target, boolean findStartIndex) {

		int ans = -1;
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				// potential ans found
				ans = mid;
				if (findStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}

}

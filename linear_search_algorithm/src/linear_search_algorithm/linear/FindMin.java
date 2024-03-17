package linear_search_algorithm.linear;

public class FindMin {

	public static void main(String[] args) {
		int [] arr = {18, 12, -7, 2, -14, 28};
		System.err.println(min(arr));

	}
	
	
	static int min(int[] arr) {
		int ans = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < ans) {
				ans = arr[i];
			}
		}
		return ans;
	}

}

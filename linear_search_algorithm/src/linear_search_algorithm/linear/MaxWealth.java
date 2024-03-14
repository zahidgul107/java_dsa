package linear_search_algorithm.linear;

public class MaxWealth {
	
	public static void main(String[] args) {
		int[][] accounts = {{1,2,3},{3,2,7}};
		System.err.println(maximumWealth(accounts));
	}
	
	public static int maximumWealth(int[][] accounts) {
		// person = row
		// account = col
		int ans = Integer.MIN_VALUE;
		for (int[] person : accounts) {
			int sum = 0;
			for (int account : person) {
				sum += account;
				System.err.println(account);
			}
			if (sum > ans) {
				ans = sum;
			}
		}
		return ans;
	}

}

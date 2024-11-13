package question;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 1, 8, 6, 3, 7};
		System.err.println(findMissingNumber(arr));
	}
	
	public static int findMissingNumber(int[] arr) {
		
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		
		for(int num : arr) {
			sum = sum - num;
		}
		
		return sum;
	}

}

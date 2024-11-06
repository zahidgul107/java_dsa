package question;

public class SecondMax {

	public static void main(String[] args) {
		
		int[] arr = {13, 34, 2, 34, 33, 1};
		
		System.err.println(findSecondMax(arr));

	}
	
	public static int findSecondMax(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}

}

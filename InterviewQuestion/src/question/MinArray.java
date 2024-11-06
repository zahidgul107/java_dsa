package question;

public class MinArray {
	
	public int findMin(int[] arr) {
		
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException();
		}
		
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, -2, 20, 10};
		MinArray min = new MinArray();
		System.err.println(min.findMin(arr));
	}

}

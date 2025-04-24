package question;

public class SortArray {
	
	public static void main(String args[]) {
		int[] arr = {8, 2, 9, 3, 1, 5};
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int num : arr) {
			System.err.println(num);
		}
		
	}

}

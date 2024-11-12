package question;

public class ResizeArray {
	
	public static void main(String[] args) {
		
		int[] arr = {5, 6, 4, 1, 8};
		arr = resize(arr, 10);
		System.err.println(arr.length);
	}
	
	public static int[] resize(int[] arr, int capacity) {
		
		int[] temp = new int[capacity];
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
	//	arr = temp;
		return temp;
	}

}

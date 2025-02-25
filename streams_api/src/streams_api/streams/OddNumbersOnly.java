package streams_api.streams;

import java.util.Arrays;

public class OddNumbersOnly {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 2, 7, 8, 9, 5 };

		int[] oddArr = removeEvenNumbers(arr);
		System.err.println(Arrays.toString(oddArr));
	}

	private static int[] removeEvenNumbers(int[] arr) {
		return Arrays.stream(arr)
							.filter(n -> n % 2 != 0)
							.toArray();
	}

}

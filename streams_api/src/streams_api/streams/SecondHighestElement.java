package streams_api.streams;

import java.util.Arrays;
import java.util.Optional;

public class SecondHighestElement {

	public static void main(String[] args) {
		int[] x = {1, 2, 5, 6, 3, 8, 7};
		System.err.println(secondHighest(x));
	}

	private static Optional<Integer> secondHighest(int[] x) {
		return Arrays.stream(x).boxed().skip(1).findFirst();
	}

}

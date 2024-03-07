package linear_search_algorithm.linear;

public class EvenDigits {

	public static void main(String[] args) {

		int[] arr = { 332, 43, 562, 6633, 33, 12, -22 };
		// System.err.println(findNumbers(arr));
		System.err.println(findNumbersByString(arr));
	}

	/**
	 * @param nums
	 * @return
	 */
	static int findNumbersByString(int[] nums) {
		int count = 0;
		for (int i : nums) {
			if (i < 0) {
				i = i * -1;
			}
			
			if (i == 0) {
				return 1;
			}
			String num = String.valueOf(i);

			if (num.length() % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	static int findNumbers(int[] nums) {
		int count = 0;
		for (int i : nums) {
			if (even(i)) {
				count++;
			}
		}
		return count;
	}

	private static boolean even(int number) {
		int numberOfDigits = numberOfDigits(number);
		if (numberOfDigits % 2 == 0) {
			return true;
		}
		return false;
	}

	private static int numberOfDigits(int number) {
		int count = 0;
		while (number > 0) {
			count++;
			number = number / 10;
		}
		return count;
	}
}

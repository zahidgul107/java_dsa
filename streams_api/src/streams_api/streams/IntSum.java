package streams_api.streams;

public class IntSum {

	public static void main(String[] args) {

		int num = 12345;
		System.err.println(sum(num));
	}

	private static int sum(int num) {
		return String.valueOf(num).chars()
				.map(ch -> ch - '0')
				.sum();
	}

}

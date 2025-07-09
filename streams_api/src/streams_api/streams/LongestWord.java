package streams_api.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestWord {

	public static void main(String[] args) {
		
		String str = "Welcome to my portfolio";
		System.err.println(longestStringWord(str));

	}

	private static Optional<String> longestStringWord(String str) {
		return Arrays.stream(str.split(" "))
				.max(Comparator.comparingInt(String::length));
	}

}

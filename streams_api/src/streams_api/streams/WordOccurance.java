package streams_api.streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccurance {

	public static void main(String[] args) {
		String str = "Java Python Java Html";
		System.err.println(occurance(str));
	}

	private static Map<String, Long> occurance(String str) {
		return Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
	}

}
